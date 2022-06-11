package co.edu.uptc.runners;

import co.edu.uptc.proveedores.modelo.Canal;
import co.edu.uptc.proveedores.modelo.Cliente;
import co.edu.uptc.proveedores.modelo.Cuenta;
import co.edu.uptc.proveedores.modelo.Marca;
import co.edu.uptc.proveedores.modelo.Origen;
import co.edu.uptc.proveedores.modelo.Plan;
import co.edu.uptc.proveedores.modelo.Producto;
import co.edu.uptc.proveedores.modelo.Proveedor;
import co.edu.uptc.utils.DBUtils;
import co.edu.uptc.utils.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Esta clase sirve como clase principal y/o ejecutora del la aplicación.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Runner {

    public void testClientesClientes() {
        Cliente cliente1 = new Cliente(172, "Fredy", "Gamba", "123");
        Cliente cliente2 = new Cliente(173, "Alejandro", "Ortiz", "456");
        cliente1.getReferenciados().add(cliente2);
        cliente2.getReferenciadoPor().add(cliente1);
        DBUtils.save(cliente1);
    }

    public void testOneToOne() {
        Proveedor proveedor = new Proveedor();
        proveedor.setCodigo(1002);
        proveedor.setContacto("Alejo contacto");
        proveedor.setDescripcion("Soy otro proveedor");
        proveedor.setPaginaWeb("http://www.youtube.com");
        proveedor.setTelefono("321");

        Marca marca = new Marca();
        marca.setNumero(123123);
        marca.setNombre("BRAMA");
        marca.setFechaRegistro(new Date());
        marca.setProveedor(proveedor);
        DBUtils.save(marca);
    }

    public void testClientes() {
        Cliente cliente = new Cliente(1, "Fredy", "gamba", "123");
        DBUtils.save(cliente);
    }

    public void gestionarMarcasYProveedores() {
        // Crear una nueva marca
        Marca marca = new Marca();
        marca.setNombre("BRAMA");
        marca.setFechaRegistro(new Date());
        Integer marcaId = (Integer) DBUtils.save(marca);

        // Seleccionar la marca creada.
        System.out.println("Se ha creado la marca: "
                + DBUtils.findById(Marca.class, marcaId));

        // Seleccionar todas las marcas
        System.out.println("Marcas agregadas: " + DBUtils.findAll(Marca.class));

        // Actualizar marca
        marca.setNombre("MUSTANG");
        DBUtils.update(marca);
        System.out.println("Se ha actualizado la marca " + marcaId
                + " con: " + DBUtils.findById(Marca.class, marcaId));

        // Agregar proveedor
        Proveedor proveedor = new Proveedor();
        proveedor.setCodigo(marcaId);
        proveedor.setContacto("Alejo contacto");
        proveedor.setDescripcion("Soy otro proveedor");
        proveedor.setPaginaWeb("http://www.youtube.com");
        proveedor.setTelefono("321");
        Integer proveedorId = (Integer) DBUtils.save(proveedor);

        // Seleccionar el proveedor creado.
        System.out.println("Se ha creado el proveedor: "
                + DBUtils.findById(Proveedor.class, proveedorId));

        // Seleccionar todas las marcas
        System.out.println("Proveedores agregados: "
                + DBUtils.findAll(Proveedor.class));

        // Actualizar proveedor
        proveedor.setContacto("Alejandro contacto");
        DBUtils.update(proveedor);
        System.out.println("Se ha actualizado el proveedor " + proveedorId
                + " con: " + DBUtils.findById(Proveedor.class, proveedorId));

        // Eliminar proveedor
        DBUtils.delete(Proveedor.class, proveedorId);
        System.out.println("Se ha eliminado el proveedor " + proveedorId);

        // Eliminar marca
        DBUtils.delete(Marca.class, marcaId);
        System.out.println("Se ha eliminado la marca " + marcaId);
    }

    private void gestionarPlanes() {
        Plan plan1 = new Plan();
        plan1.setCodigo(100);
        plan1.setNombre("TV SATELITAL 100");
        plan1.setCosto(200);

        Plan plan2 = new Plan(200, 59800, "TV AVANZADA 200");
        Plan plan3 = new Plan(300, 155200, "TV AVANZADA 300");

        Canal canal1 = new Canal();
        canal1.setCodigo(10004);
        canal1.setLogo("ss");
        canal1.setNombre("ASDASD");
        canal1.setTipo("SUPER");

        Canal canal2 = new Canal(10005, "RCN TELEVISION", "RCN", "SUPER");
        Canal canal3 = new Canal(10006, "HEALT AND HEAL", "H&H", "SUPER");
        Canal canal4 = new Canal(10007, "DISNEY JUNIOR", "DJ", "WUPER");

        plan1.getCanales().add(canal1);
        plan1.getCanales().add(canal2);
        plan1.getCanales().add(canal3);
        plan1.getCanales().add(canal4);

        plan2.getCanales().add(canal3);

        plan3.getCanales().add(canal1);
        plan3.getCanales().add(canal4);

        canal1.getPlanes().add(plan1);
        canal1.getPlanes().add(plan3);

        canal2.getPlanes().add(plan1);
//        
        canal3.getPlanes().add(plan1);
        canal3.getPlanes().add(plan2);
//        
        canal4.getPlanes().add(plan1);
        canal4.getPlanes().add(plan3);

        DBUtils.save(plan1);
    }

    /**
     * Función principal de la aplicación.
     *
     * @param args Argumentos de inicio de la aplicación.
     */
    public static void main(String[] args) {
        new Runner().testClientesClientes();
//        new Runner().testHQLOrigen();
    }

    public void testSQLOrigen() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            Session session = sessionFactory.openSession();
            List<Object[]> resultados = session.createSQLQuery(
                    "SELECT CODIGO, DESCRIPCION FROM ORIGEN").list();
            String texto = "";
            for (Object[] fila : resultados) {
                for (Object columna : fila) {
                    texto += columna + "\t";
                }
                texto += "\n";
            }
            System.out.println(texto);
        }
    }

    public void testHQLOrigen() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            Session session = sessionFactory.openSession();
            List<Origen> origenes = session.createQuery("SELECT o FROM Origen o").list();
            String texto = "";
            for (Origen origen : origenes) {
                texto += origen.getCodigo() + "\t" + origen.getDescripcion() + "\n";
            }
            System.out.println(texto);
            List<Object[]> resultados = session.createQuery(
                    "SELECT o.descripcion, p.descripcion "
                    + "FROM Origen o, Producto p "
                    + "WHERE p.origen = o").list();
            texto = "";
            for (Object[] resultado : resultados) {
                for (Object object : resultado) {
                    texto += object + "\t\t";
                }
                texto += "\n";
            }
            System.out.println(texto);
            origenes = session.getNamedQuery("todosLosOrigenes").list();
            for (Origen origen : origenes) {
                texto += origen.getCodigo() + "\t" + origen.getDescripcion() + "\n";
            }
            System.out.println(texto);
        }
    }

    public void testClienteCuenta() {
        Cliente cliente = new Cliente(12, "Fredy", "Gamba", "123");

        Cuenta cuenta = new Cuenta(123, "abc", "123");
        cliente.setCuenta(cuenta);
        DBUtils.save(cliente);
    }

    public void testCuentaCliente() {
        Cuenta cuenta = new Cuenta(124, "abcd", "124");
        Cliente cliente = new Cliente(13, "Alejandro", "Ortiz", "124");
        cuenta.setCliente(cliente);
        DBUtils.save(cuenta);
    }

    public void gestionarUnoAMuchos() {
        Origen origen1 = new Origen(11, "CABLE UPT");
        Origen origen2 = new Origen(12, "SATELITAL");

        Producto producto1 = new Producto(1000, 0, "TELEVISIÓN POR CABLE 1000", origen1, "TELEVISIÓN");
        Producto producto2 = new Producto(1001, 0, "INTERNET POR CABLE 1001", origen1, "INTERNET");
        Producto producto3 = new Producto(1002, 0, "INTERNET SATELITA 1002", origen2, "INTERNET");
        DBUtils.save(producto1);
        DBUtils.save(producto2);
        DBUtils.save(producto3);
    }

    public void gestionarMuchosAUno() {
        // Muchos a uno
        Origen origen1 = new Origen(23, "ANTENAS TERRESTRES");
        Origen origen2 = new Origen(24, "FIBRA ÓTICA");

        Producto producto1 = new Producto(5000, 5555, "APP TDT", origen1, "TELEVISIÓN");
        Producto producto2 = new Producto(5001, 3333, "APP INTERNET ANTENAS", origen1, "INTERNET");
        Producto producto3 = new Producto(5003, 2222, "APP INTERNET FIBRA", origen2, "INTERNET");

        origen1.getProductos().add(producto1);
        origen1.getProductos().add(producto2);
        origen1.getProductos().add(producto3);
        DBUtils.save(origen1);
        DBUtils.save(origen2);
    }

}
