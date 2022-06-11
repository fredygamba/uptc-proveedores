package co.edu.uptc.runners;

import co.edu.uptc.proveedores.modelo.Canal;
import co.edu.uptc.proveedores.modelo.Marca;
import co.edu.uptc.proveedores.modelo.Plan;
import co.edu.uptc.proveedores.modelo.Proveedor;
import co.edu.uptc.utils.DBUtils;
import co.edu.uptc.utils.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;

/**
 * Esta clase sirve como clase principal y/o ejecutora del la aplicación.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Runner {
    
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

    /**
     * Función principal de la aplicación.
     *
     * @param args Argumentos de inicio de la aplicación.
     */
    public static void main(String[] args) {
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
    
}
