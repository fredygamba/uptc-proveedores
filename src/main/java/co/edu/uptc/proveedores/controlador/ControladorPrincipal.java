/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.controlador;

import co.edu.uptc.proveedores.dao.CanalDAO;
import co.edu.uptc.proveedores.dao.ClienteDAO;
import co.edu.uptc.proveedores.dao.CuentaDAO;
import co.edu.uptc.proveedores.dao.CuentaProveedorDAO;
import co.edu.uptc.proveedores.dao.MarcaDAO;
import co.edu.uptc.proveedores.dao.OrigenDAO;
import co.edu.uptc.proveedores.dao.PlanDAO;
import co.edu.uptc.proveedores.dao.ProductoDAO;
import co.edu.uptc.proveedores.dao.ProveedorDAO;
import co.edu.uptc.proveedores.modelo.Canal;
import co.edu.uptc.proveedores.modelo.Cliente;
import co.edu.uptc.proveedores.modelo.Cuenta;
import co.edu.uptc.proveedores.modelo.CuentaProveedor;
import co.edu.uptc.proveedores.modelo.CuentaProveedorId;
import co.edu.uptc.proveedores.modelo.Marca;
import co.edu.uptc.proveedores.modelo.Origen;
import co.edu.uptc.proveedores.modelo.Plan;
import co.edu.uptc.proveedores.modelo.Producto;
import co.edu.uptc.proveedores.modelo.Proveedor;
import co.edu.uptc.proveedores.vista.CanalVistaPanel;
import co.edu.uptc.proveedores.vista.ClienteVistaPanel;
import co.edu.uptc.proveedores.vista.CuentaProveedorVista;
import co.edu.uptc.proveedores.vista.CuentaVistaPanel;
import co.edu.uptc.proveedores.vista.MainFrame;
import co.edu.uptc.proveedores.vista.MarcaVistaPanel;
import co.edu.uptc.proveedores.vista.OrigenVistaPanel;
import co.edu.uptc.proveedores.vista.PlanVistaPanel;
import co.edu.uptc.proveedores.vista.ProductoVistaPanel;
import co.edu.uptc.proveedores.vista.ProveedorVistaPanel;
import co.edu.uptc.utils.DBUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy
 */
public class ControladorPrincipal implements ActionListener {

    public static final String ACCION_ACTUALIZAR_CANAL = "actualizarCanal";
    public static final String ACCION_ACTUALIZAR_CLIENTE = "actualizarCliente";
    public static final String ACCION_ACTUALIZAR_CUENTA = "actualizarCuenta";
    public static final String ACCION_ACTUALIZAR_CUENTA_PROVEEDOR = "actualizarCuentaProveedor";
    public static final String ACCION_ACTUALIZAR_MARCA = "actualizarMarca";
    public static final String ACCION_ACTUALIZAR_PLAN = "actualizarPlan";
    public static final String ACCION_ACTUALIZAR_PRODUCTO = "actualizarProducto";
    public static final String ACCION_ACTUALIZAR_PROVEEDOR = "actualizarProveedor";
    public static final String ACCION_AGREGAR_CANAL = "agregarCanal";
    public static final String ACCION_AGREGAR_CANAL_PLAN = "agregarCanalPlan";
    public static final String ACCION_AGREGAR_CLIENTE = "agregarCliente";
    public static final String ACCION_AGREGAR_CUENTA = "agregarCuenta";
    public static final String ACCION_AGREGAR_CUENTA_PROVEEDOR = "agregarCuentaProveedor";
    public static final String ACCION_AGREGAR_MARCA = "agregarMarca";
    public static final String ACCION_AGREGAR_ORIGEN = "agregarOrigen";
    public static final String ACCION_AGREGAR_PLAN = "agregarPlan";
    public static final String ACCION_AGREGAR_PLAN_CANAL = "agregarPlanCanal";
    public static final String ACCION_AGREGAR_PRODUCTO = "agregarProducto";
    public static final String ACCION_AGREGAR_PROVEEDOR = "agregarProveedor";
    public static final String ACCION_AGREGAR_REFERENCIADO = "agregarReferenciado";
    public static final String ACCION_CONSULTAR_CANAL = "consultarCanal";
    public static final String ACCION_CONSULTAR_CLIENTE = "consultarCliente";
    public static final String ACCION_CONSULTAR_CUENTA = "consultarCuenta";
    public static final String ACCION_CONSULTAR_CUENTA_PROVEEDOR = "consultarCuentaProveedor";
    public static final String ACCION_CONSULTAR_MARCA = "consultarMarca";
    public static final String ACCION_CONSULTAR_PLAN = "consultarPlan";
    public static final String ACCION_CONSULTAR_PRODUCTO = "consultarProducto";
    public static final String ACCION_CONSULTAR_PROVEEDOR = "consultarProveedor";
    public static final String ACCION_ELIMINAR_CANAL = "eliminarCanal";
    public static final String ACCION_ELIMINAR_CLIENTE = "eliminarCliente";
    public static final String ACCION_ELIMINAR_CUENTA = "eliminarCuenta";
    public static final String ACCION_ELIMINAR_CUENTA_PROVEEDOR = "eliminarCuentaProveedor";
    public static final String ACCION_ELIMINAR_MARCA = "eliminarMarca";
    public static final String ACCION_ELIMINAR_PLAN = "eliminarPlan";
    public static final String ACCION_ELIMINAR_PRODUCTO = "eliminarProducto";
    public static final String ACCION_ELIMINAR_PROVEEDOR = "eliminarProveedor";

    private final MainFrame mainFrame;
    private final CanalDAO canalDAO;
    private final ClienteDAO clienteDAO;
    private final CuentaDAO cuentaDAO;
    private final CuentaProveedorDAO cuentaProveedorDAO;
    private final MarcaDAO marcaDAO;
    private final OrigenDAO origenDAO;
    private final PlanDAO planDAO;
    private final ProductoDAO productoDAO;
    private final ProveedorDAO proveedorDAO;

    public ControladorPrincipal() {
        this.mainFrame = new MainFrame(this);
        this.canalDAO = new CanalDAO();
        this.clienteDAO = new ClienteDAO();
        this.cuentaDAO = new CuentaDAO();
        this.cuentaProveedorDAO = new CuentaProveedorDAO();
        this.marcaDAO = new MarcaDAO();
        this.origenDAO = new OrigenDAO();
        this.planDAO = new PlanDAO();
        this.productoDAO = new ProductoDAO();
        this.proveedorDAO = new ProveedorDAO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()) {
            case ACCION_ACTUALIZAR_CANAL:
                this.actualizarCanal();
                break;
            case ACCION_ACTUALIZAR_CLIENTE:
                this.actualizarCliente();
                break;
            case ACCION_ACTUALIZAR_CUENTA:
                this.actualizarCuenta();
                break;
            case ACCION_ACTUALIZAR_CUENTA_PROVEEDOR:
                this.actualizarCuentaProveedor();
                break;
            case ACCION_ACTUALIZAR_MARCA:
                this.actualizarMarca();
                break;
            case ACCION_ACTUALIZAR_PLAN:
                this.actualizarPlan();
                break;
            case ACCION_ACTUALIZAR_PRODUCTO:
                this.actualizarProducto();
                break;
            case ACCION_ACTUALIZAR_PROVEEDOR:
                this.actualizarProveedor();
                break;
            case ACCION_AGREGAR_CANAL:
                this.agregarCanal();
                break;
            case ACCION_AGREGAR_CANAL_PLAN:
                this.agregarCanalPlan();
                break;
            case ACCION_AGREGAR_CLIENTE:
                this.agregarCliente();
                break;
            case ACCION_AGREGAR_CUENTA:
                this.agregarCuenta();
                break;
            case ACCION_AGREGAR_CUENTA_PROVEEDOR:
                this.agregarCuentaProveedor();
                break;
            case ACCION_AGREGAR_MARCA:
                this.agregarMarca();
                break;
            case ACCION_AGREGAR_ORIGEN:
                this.agregarOrigen();
                break;
            case ACCION_AGREGAR_PLAN:
                this.agregarPlan();
                break;
            case ACCION_AGREGAR_PLAN_CANAL:
                this.agregarPlanCanal();
                break;
            case ACCION_AGREGAR_PRODUCTO:
                this.agregarProducto();
                break;
            case ACCION_AGREGAR_PROVEEDOR:
                this.agregarProveedor();
                break;
            case ACCION_AGREGAR_REFERENCIADO:
                this.agregarReferenciado();
                break;
            case ACCION_CONSULTAR_CANAL:
                this.consultarCanal();
                break;
            case ACCION_CONSULTAR_CLIENTE:
                this.consultarCliente();
                break;
            case ACCION_CONSULTAR_CUENTA:
                this.consultarCuenta();
                break;
            case ACCION_CONSULTAR_CUENTA_PROVEEDOR:
                this.consultarCuentaProveedor();
                break;
            case ACCION_CONSULTAR_MARCA:
                this.consultarMarca();
                break;
            case ACCION_CONSULTAR_PLAN:
                this.consultarPlan();
                break;
            case ACCION_CONSULTAR_PRODUCTO:
                this.consultarProducto();
                break;
            case ACCION_CONSULTAR_PROVEEDOR:
                this.consultarProveedor();
                break;
            case ACCION_ELIMINAR_CANAL:
                this.eliminarCanal();
                break;
            case ACCION_ELIMINAR_CLIENTE:
                this.eliminarCliente();
                break;
            case ACCION_ELIMINAR_CUENTA:
                this.eliminarCuenta();
                break;
            case ACCION_ELIMINAR_CUENTA_PROVEEDOR:
                this.eliminarCuentaProveedor();
                break;
            case ACCION_ELIMINAR_MARCA:
                this.eliminarMarca();
                break;
            case ACCION_ELIMINAR_PLAN:
                this.eliminarPlan();
                break;
            case ACCION_ELIMINAR_PRODUCTO:
                this.eliminarProducto();
                break;
            case ACCION_ELIMINAR_PROVEEDOR:
                this.eliminarProveedor();
                break;
            default:
                Logger.getLogger(ControladorPrincipal.class.getName())
                        .log(Level.SEVERE, "Opción en desarrollo.");
                break;
        }
    }

    private void actualizarCanal() {
        CanalVistaPanel canalVista = this.mainFrame.getCanalVista();
        Canal canal = canalVista.getCanal();
        Canal auxCanal = this.canalDAO.consultar(canal.getCodigo());
        if (auxCanal == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la marca ingresada.");
        } else {
            auxCanal.setLogo(canal.getLogo());
            auxCanal.setNombre(canal.getNombre());
            auxCanal.setPlanes(canal.getPlanes());
            auxCanal.setTipo(canal.getTipo());
            this.canalDAO.actualizar(auxCanal);
            canalVista.limpiarFormulario();
            canalVista.setCanales(this.canalDAO.consultar());
        }
    }

    private void actualizarCliente() {
        ClienteVistaPanel clienteVista = this.mainFrame.getClienteVista();
        Cliente cliente = clienteVista.getCliente();
        if (this.clienteDAO.consultar(cliente.getNumero()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el cliente ingresado.");
        } else {
            this.clienteDAO.actualizar(cliente);
            clienteVista.limpiarFormulario();
            List<Cliente> clientes = this.clienteDAO.consultar();
            clienteVista.setClientes(clientes);
            this.mainFrame.getCuentaVista().setClientes(clientes);
        }
    }

    private void actualizarCuenta() {
        CuentaVistaPanel cuetaVista = this.mainFrame.getCuentaVista();
        Cuenta cuenta = cuetaVista.getCuenta();
        if ((this.cuentaDAO.consultar(cuenta.getCodigo())) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta ingresada.");
        } else {
            this.cuentaDAO.actualizar(cuenta);
            cuetaVista.limpiarFormulario();
            List<Cuenta> cuentas = this.cuentaDAO.consultar();
            cuetaVista.setCuentas(cuentas);
            this.mainFrame.getClienteVista().setCuentas(cuentas);
        }
    }

    private void actualizarCuentaProveedor() {
        CuentaProveedorVista cuentaProveedorVista = this.mainFrame.getCuentaProveedorVista();
        CuentaProveedor cuentaProveedor = cuentaProveedorVista.getCuentaProveedor();
        CuentaProveedorId id = cuentaProveedor.getId();
        if (id.getCodigoCuenta() == null || id.getCodigoProveedor() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una cuenta y un proveedor.");
        } else if (this.cuentaProveedorDAO.consultar(id) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta proveedor ingresada.");
        } else {
            this.cuentaProveedorDAO.actualizar(cuentaProveedor);
            cuentaProveedorVista.limpiarFormulario();
            cuentaProveedorVista.setCuentasProveedores(this.cuentaProveedorDAO.consultar());
        }
    }

    private void actualizarMarca() {
        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        Marca marca = marcaVista.getMarca();
        Proveedor proveedor = marca.getProveedor();
        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor");
        } else {
            Marca auxMarca = this.marcaDAO.consultar(marca.getNumero());
            if (auxMarca == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la marca con el proveedor seleccionado.");
            } else {
                auxMarca.setNombre(marca.getNombre());
                this.marcaDAO.actualizar(auxMarca);
                marcaVista.limpiarFormulario();
                List<Marca> marcas = this.marcaDAO.consultar();
                marcaVista.setMarcas(marcas);
                this.mainFrame.getProveedorVista().setMarcas(marcas);
            }
        }
    }

    private void actualizarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = planVista.getPlan();
        System.out.println(plan.getCanales());
        if (this.planDAO.consultar(plan.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el plan ingresado.");
        } else {
            this.planDAO.actualizar(plan);
            planVista.limpiarFormulario();
            List<Plan> planes = this.planDAO.consultar();
            planVista.setPlanes(planes);
        }
    }

    private void actualizarProducto() {
        ProductoVistaPanel productoVista = this.mainFrame.getProductoVista();
        Producto producto = productoVista.getProducto();
        if (this.productoDAO.consultar(producto.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto ingresado.");
        } else {
            this.productoDAO.actualizar(producto);
            productoVista.limpiarFormulario();
            productoVista.setProductos(this.productoDAO.consultar());
        }
    }

    private void actualizarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        if (this.proveedorDAO.consultar(proveedor.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al proveedor ingresado.");
        } else {
            this.proveedorDAO.actualizar(proveedor);
            proveedorVista.limpiarFormulario();
            List<Proveedor> proveedores = this.proveedorDAO.consultar();
            proveedorVista.setProveedores(proveedores);
            this.mainFrame.getMarcaVista().setProveedores(proveedores);
        }
    }

    private void agregarCanal() {
        CanalVistaPanel canalVista = this.mainFrame.getCanalVista();
        Canal canal = canalVista.getCanal();
        if (canalDAO.consultar(canal.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el canal.");
        } else {
            canalDAO.agregar(canal);
            canalVista.setCanales(this.canalDAO.consultar());
            canalVista.limpiarFormulario();
        }
    }

    private void agregarCanalPlan() {
        CanalVistaPanel canalVista = this.mainFrame.getCanalVista();
        Set<Plan> planesCanal = canalVista.getCanal().getPlanes();
        List<Plan> planes = this.planDAO.consultar();
        List<Plan> planesRestantes = new ArrayList<>();
        boolean encontrado;
        for (Plan plan : planes) {
            encontrado = false;
            for (Plan planCanal : planesCanal) {
                if (planCanal.getCodigo().equals(plan.getCodigo())) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                planesRestantes.add(plan);
            }
        }
        Object object = JOptionPane.showInputDialog(null, "Seleccione un plan", "Agregar plan",
                0, null, planesRestantes.toArray(), null);
        if (object != null) {
            Plan plan = (Plan) object;
            canalVista.agregarPlan((Plan) plan);
        }
    }

    private void agregarCliente() {
        ClienteVistaPanel clienteVista = this.mainFrame.getClienteVista();
        Cliente cliente = clienteVista.getCliente();
        if (clienteDAO.consultar(cliente.getNumero()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el cliente.");
        } else {
            clienteDAO.agregar(cliente);
            clienteVista.limpiarFormulario();
            List<Cliente> clientes = this.clienteDAO.consultar();
            clienteVista.setClientes(clientes);
            this.mainFrame.getCuentaVista().setClientes(clientes);
        }
    }

    private void agregarCuenta() {
        CuentaVistaPanel cuentaVista = this.mainFrame.getCuentaVista();
        Cuenta cuenta = cuentaVista.getCuenta();
        if (cuentaDAO.consultar(cuenta.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrada la cuenta.");
        } else {
            cuentaDAO.agregar(cuenta);
            List<Cuenta> cuentas = this.cuentaDAO.consultar();
            cuentaVista.setCuentas(cuentas);
            this.mainFrame.getClienteVista().setCuentas(cuentas);
            cuentaVista.limpiarFormulario();
        }
    }

    private void agregarCuentaProveedor() {
        CuentaProveedorVista cuentaProveedorVista = this.mainFrame.getCuentaProveedorVista();
        CuentaProveedor cuentaProveedor = cuentaProveedorVista.getCuentaProveedor();
        CuentaProveedorId id = cuentaProveedor.getId();
        if (id.getCodigoCuenta() == null || id.getCodigoProveedor() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una cuenta y un proveedor.");
        } else if (cuentaProveedorDAO.consultar(id) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado la cuenta proveedor.");
        } else {
            cuentaProveedorDAO.agregar(cuentaProveedor);
            cuentaProveedorVista.setCuentasProveedores(this.cuentaProveedorDAO.consultar());
            cuentaProveedorVista.limpiarFormulario();
        }
    }

    private void agregarMarca() {
        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        Marca marca = marcaVista.getMarca();
        Proveedor proveedor = marca.getProveedor();
        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor.");
        } else if (DBUtils.findById(Marca.class, proveedor.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado la marca con el proveedor elegido.");
        } else {
            marca.setNumero(proveedor.getCodigo());
            marca.setFechaRegistro(new Date());
            this.marcaDAO.agregar(marca);
            marcaVista.limpiarFormulario();
            marcaVista.setMarcas(this.marcaDAO.consultar());
        }
    }

    private void agregarOrigen() {
        OrigenVistaPanel origenVista = this.mainFrame.getOrigenVista();
        Origen origen = origenVista.getOrigen();
        if (this.origenDAO.consultar(origen.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el canal.");
        } else {
            this.origenDAO.agregar(origen);
            origenVista.setOrigenes(this.origenDAO.consultar());
        }
    }

    private void agregarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = planVista.getPlan();
        System.out.println(plan);
        System.out.println(plan.getCanales());
        if (this.planDAO.consultar(plan.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el plan.");
        } else {
            this.planDAO.agregar(plan);
            planVista.limpiarFormulario();
            planVista.setPlanes(this.planDAO.consultar());
        }
    }

    private void agregarPlanCanal() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Set<Canal> canalesPlan = planVista.getPlan().getCanales();
        List<Canal> canales = this.canalDAO.consultar();
        List<Canal> canalesRestantes = new ArrayList<>();
        boolean encontrado;
        for (Canal canal : canales) {
            encontrado = false;
            for (Canal canalPlan : canalesPlan) {
                if (canalPlan.getCodigo().equals(canal.getCodigo())) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                canalesRestantes.add(canal);
            }
        }
        Object object = JOptionPane.showInputDialog(null, "Seleccione un canal...",
                "Agregar canal", 0, null, canalesRestantes.toArray(), null);
        if (object != null) {
            planVista.agregarCanal((Canal) object);
        }
    }

    private void agregarProducto() {
        ProductoVistaPanel productoVista = this.mainFrame.getProductoVista();
        Producto producto = productoVista.getProducto();
        if (this.productoDAO.consultar(producto.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el producto.");
        } else {
            this.productoDAO.agregar(producto);
            productoVista.setProductos(this.productoDAO.consultar());
        }
    }

    private void agregarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        if (this.proveedorDAO.consultar(proveedor.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el proveedor.");
        } else {
            this.proveedorDAO.agregar(proveedor);
            proveedorVista.limpiarFormulario();
            List<Proveedor> proveedores = this.proveedorDAO.consultar();
            proveedorVista.setProveedores(proveedores);
            this.mainFrame.getMarcaVista().setProveedores(proveedores);
        }
    }

    private void agregarReferenciado() {
        ClienteVistaPanel clienteVista = this.mainFrame.getClienteVista();
        Cliente clienteForm = clienteVista.getCliente();
        Set<Cliente> clienteReferenciados = clienteForm.getReferenciados();
        List<Cliente> clientes = this.clienteDAO.consultar();
        List<Cliente> clientesRestantes = new ArrayList<>();
        boolean encontrado;
        for (Cliente cliente : clientes) {
            if (!cliente.getNumero().equals(clienteForm.getNumero())) {
                encontrado = false;
                for (Cliente clienteReferenciado : clienteReferenciados) {
                    if (clienteReferenciado.getNumero().equals(cliente.getNumero())) {
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    clientesRestantes.add(cliente);
                }
            }
        }
        Object referenciado = JOptionPane.showInputDialog(null, "Seleccione un cliente", "Elegir cliente",
                0, null, clientesRestantes.toArray(), null);
        if (referenciado != null) {
            clienteVista.agregarReferenciado((Cliente) referenciado);
        }
    }

    private void cargarVistas() {
        List<Canal> canales = this.canalDAO.consultar();
        List<Cliente> clientes = this.clienteDAO.consultar();
        List<Cuenta> cuentas = this.cuentaDAO.consultar();
        List<Marca> marcas = this.marcaDAO.consultar();
        List<Origen> origenes = this.origenDAO.consultar();
        List<Plan> planes = this.planDAO.consultar();
        List<Producto> productos = this.productoDAO.consultar();
        List<Proveedor> proveedores = this.proveedorDAO.consultar();

        ClienteVistaPanel clienteVista = this.mainFrame.getClienteVista();
        clienteVista.setCuentas(cuentas);
        clienteVista.setClientes(clientes);

        CuentaVistaPanel cuentaVista = this.mainFrame.getCuentaVista();
        cuentaVista.setCuentas(cuentas);
        cuentaVista.setClientes(clientes);

        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        marcaVista.setMarcas(marcas);
        marcaVista.setProveedores(proveedores);

        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        proveedorVista.setProveedores(proveedores);
        proveedorVista.setMarcas(marcas);

        ProductoVistaPanel productoVista = this.mainFrame.getProductoVista();
        productoVista.setOrigenes(origenes);

        CuentaProveedorVista cuentaProveedorVista = this.mainFrame.getCuentaProveedorVista();
        cuentaProveedorVista.setPlanes(planes);
        cuentaProveedorVista.setProductos(productos);
        cuentaProveedorVista.setProveedores(proveedores);
        cuentaProveedorVista.setCuentas(cuentas);
        cuentaProveedorVista.setCuentasProveedores(this.cuentaProveedorDAO.consultar());

        this.mainFrame.getCanalVista().setCanales(canales);
        this.mainFrame.getPlanVista().setPlanes(planes);
        this.mainFrame.getOrigenVista().setOrigenes(origenes);
        this.mainFrame.getProductoVista().setProductos(productos);
    }

    private void consultarCanal() {
        CanalVistaPanel canalVista = this.mainFrame.getCanalVista();
        Canal canal = canalVista.getCanal();
        canal = this.canalDAO.consultar(canal.getCodigo());
        if (canal == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el canal.");
        } else {
            canalVista.setCanal(canal);
        }
    }

    private void consultarCliente() {
        ClienteVistaPanel clienteVista = this.mainFrame.getClienteVista();
        Cliente cliente = clienteVista.getCliente();
        cliente = this.clienteDAO.consultar(cliente.getNumero());
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el cliente.");
        } else {
            clienteVista.setCliente(cliente);
        }
    }

    private void consultarCuenta() {
        CuentaVistaPanel cuentaVista = this.mainFrame.getCuentaVista();
        Cuenta cuenta = cuentaVista.getCuenta();
        if ((cuenta = this.cuentaDAO.consultar(cuenta.getCodigo())) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta");
        } else {
            cuentaVista.setCuenta(cuenta);
        }
    }

    private void consultarCuentaProveedor() {
        CuentaProveedorVista cuentaProveedorVista = this.mainFrame.getCuentaProveedorVista();
        CuentaProveedor cuentaProveedor = cuentaProveedorVista.getCuentaProveedor();
        CuentaProveedorId id = cuentaProveedor.getId();
        if (id.getCodigoCuenta() == null || id.getCodigoProveedor() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una cuenta y un proveedor.");
        } else if ((cuentaProveedor = this.cuentaProveedorDAO.consultar(id)) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta proveedor.");
        } else {
            cuentaProveedorVista.setCuentaProveedor(cuentaProveedor);
        }
    }

    private void consultarMarca() {
        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        Marca marca = marcaVista.getMarca();
        Proveedor proveedor = marca.getProveedor();
        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor.");
        } else {
            marca = this.marcaDAO.consultar(marca.getProveedor().getCodigo());
            if (marca == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la marca");
            } else {
                marcaVista.setMarca(marca);
            }
        }
    }

    private void consultarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = planVista.getPlan();
        if ((plan = this.planDAO.consultar(plan.getCodigo())) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el plan.");
        } else {
            planVista.setPlan(plan);
        }
    }

    private void consultarProducto() {
        ProductoVistaPanel productoVista = this.mainFrame.getProductoVista();
        Producto producto = productoVista.getProducto();
        if ((producto = this.productoDAO.consultar(producto.getCodigo())) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.");
        } else {
            productoVista.setProducto(producto);
        }
    }

    private void consultarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        proveedor = this.proveedorDAO.consultar(proveedor.getCodigo());
        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el proveedor.");
        } else {
            proveedorVista.setProveedor(proveedor);
        }
    }

    private void eliminarCanal() {
        CanalVistaPanel canalVista = this.mainFrame.getCanalVista();
        Canal canal = canalVista.getCanal();
        canal = this.canalDAO.consultar(canal.getCodigo());
        if (canal == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al canal ingresado.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el proveedor?") == 0) {
            this.canalDAO.eliminar(canal);
            canalVista.limpiarFormulario();
            canalVista.setCanales(this.canalDAO.consultar());
        }
    }

    private void eliminarCliente() {
        ClienteVistaPanel clienteVista = this.mainFrame.getClienteVista();
        Cliente cliente = clienteVista.getCliente();
        cliente = this.clienteDAO.consultar(cliente.getNumero());
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al cliente ingresado.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el cliente?") == 0) {
            this.clienteDAO.eliminar(cliente);
            clienteVista.limpiarFormulario();
            List<Cliente> clientes = this.clienteDAO.consultar();
            clienteVista.setClientes(clientes);
            this.mainFrame.getCuentaVista().setClientes(clientes);
        }
    }

    private void eliminarCuenta() {
        CuentaVistaPanel cuentaVista = this.mainFrame.getCuentaVista();
        Cuenta cuenta = cuentaVista.getCuenta();
        cuenta = this.cuentaDAO.consultar(cuenta.getCodigo());
        if (cuenta == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta ingresada.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la cuenta?") == 0) {
            this.cuentaDAO.eliminar(cuenta);
            cuentaVista.limpiarFormulario();
            cuentaVista.setCuentas(this.cuentaDAO.consultar());
        }
    }

    private void eliminarCuentaProveedor() {
        CuentaProveedorVista cuentaProveedorVista = this.mainFrame.getCuentaProveedorVista();
        CuentaProveedor cuentaProveedor = cuentaProveedorVista.getCuentaProveedor();
        CuentaProveedorId id = cuentaProveedor.getId();
        if (id.getCodigoCuenta() == null || id.getCodigoProveedor() == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una cuenta y un proveedor.");
        } else if ((cuentaProveedor = this.cuentaProveedorDAO.consultar(id)) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la cuenta ingresada.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la cuenta?") == 0) {
            this.cuentaProveedorDAO.eliminar(cuentaProveedor);
            cuentaProveedorVista.limpiarFormulario();
            cuentaProveedorVista.setCuentasProveedores(this.cuentaProveedorDAO.consultar());
        }
    }

    private void eliminarMarca() {
        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        Marca marca = marcaVista.getMarca();
        marca = this.marcaDAO.consultar(marca.getNumero());
        if (marca == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la marca ingresada.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la marca?") == 0) {
            this.marcaDAO.eliminar(marca);
            marcaVista.limpiarFormulario();
            List<Marca> marcas = this.marcaDAO.consultar();
            marcaVista.setMarcas(marcas);
            this.mainFrame.getProveedorVista().setMarcas(marcas);
        }
    }

    private void eliminarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = this.planDAO.consultar(planVista.getPlan().getCodigo());
        if (plan == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el plan.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el plan?") == 0) {
            this.planDAO.eliminar(plan);
            planVista.limpiarFormulario();
            planVista.setPlanes(this.planDAO.consultar());
        }
    }

    private void eliminarProducto() {
        ProductoVistaPanel productoVista = this.mainFrame.getProductoVista();
        Producto producto = this.productoDAO.consultar(productoVista.getProducto().getCodigo());
        if (producto == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el producto.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto?") == 0) {
            this.productoDAO.eliminar(producto);
            productoVista.limpiarFormulario();
            productoVista.setProductos(this.productoDAO.consultar());
        }
    }

    private void eliminarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        if (this.proveedorDAO.consultar(proveedor.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al proveedor ingresado.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el proveedor?") == 0) {
            this.proveedorDAO.eliminar(proveedor);
            proveedorVista.limpiarFormulario();
            List<Proveedor> proveedores = this.proveedorDAO.consultar();
            proveedorVista.setProveedores(proveedores);
            this.mainFrame.getMarcaVista().setProveedores(proveedores);
        }
    }

    public void iniciarAplicacion() {
        this.cargarVistas();
        this.mainFrame.setVisible(true);
    }

}
