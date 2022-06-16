/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.controlador;

import co.edu.uptc.proveedores.dao.CanalDAO;
import co.edu.uptc.proveedores.dao.MarcaDAO;
import co.edu.uptc.proveedores.dao.PlanDAO;
import co.edu.uptc.proveedores.dao.ProveedorDAO;
import co.edu.uptc.proveedores.modelo.Canal;
import co.edu.uptc.proveedores.modelo.Marca;
import co.edu.uptc.proveedores.modelo.Plan;
import co.edu.uptc.proveedores.modelo.Proveedor;
import co.edu.uptc.proveedores.vista.CanalVistaPanel;
import co.edu.uptc.proveedores.vista.MainFrame;
import co.edu.uptc.proveedores.vista.MarcaVistaPanel;
import co.edu.uptc.proveedores.vista.PlanVistaPanel;
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
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy
 */
public class ControladorPrincipal implements ActionListener {

    public static final String ACCION_ACTUALIZAR_PROVEEDOR = "actualizarProveedor";
    public static final String ACCION_ACTUALIZAR_CANAL = "actualizarCanal";
    public static final String ACCION_ACTUALIZAR_PLAN = "actualizarPlan";
    public static final String ACCION_AGREGAR_CANAL = "agregarCanal";
    public static final String ACCION_AGREGAR_CANAL_PLAN = "agregarCanalPlan";
    public static final String ACCION_AGREGAR_MARCA = "agregarMarca";
    public static final String ACCION_AGREGAR_PLAN = "agregarPlan";
    public static final String ACCION_AGREGAR_PLAN_CANAL = "agregarPlanCanal";
    public static final String ACCION_AGREGAR_PROVEEDOR = "agregarProveedor";
    public static final String ACCION_CONSULTAR_CANAL = "consultarCanal";
    public static final String ACCION_CONSULTAR_PLAN = "consultarPlan";
    public static final String ACCION_CONSULTAR_PROVEEDOR = "consultarProveedor";
    public static final String ACCION_ELIMINAR_CANAL = "eliminarCanal";
    public static final String ACCION_ELIMINAR_PLAN = "eliminarPlan";
    public static final String ACCION_ELIMINAR_PROVEEDOR = "eliminarProveedor";

    private final MainFrame mainFrame;
    private final CanalDAO canalDAO;
    private final MarcaDAO marcaDAO;
    private final PlanDAO planDAO;
    private final ProveedorDAO proveedorDAO;

    public ControladorPrincipal() {
        this.mainFrame = new MainFrame(this);
        this.canalDAO = new CanalDAO();
        this.marcaDAO = new MarcaDAO();
        this.planDAO = new PlanDAO();
        this.proveedorDAO = new ProveedorDAO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()) {
            case ACCION_ACTUALIZAR_CANAL:
                this.actualizarCanal();
                break;
            case ACCION_ACTUALIZAR_PLAN:
                this.actualizarPlan();
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
            case ACCION_AGREGAR_PLAN:
                this.agregarPlan();
                break;
            case ACCION_AGREGAR_MARCA:
                this.agregarMarca();
                break;
            case ACCION_AGREGAR_PROVEEDOR:
                this.agregarProveedor();
                break;
            case ACCION_CONSULTAR_CANAL:
                this.consultarCanal();
                break;
            case ACCION_CONSULTAR_PLAN:
                this.consultarPlan();
                break;
            case ACCION_CONSULTAR_PROVEEDOR:
                this.consultarProveedor();
                break;
            case ACCION_ELIMINAR_CANAL:
                this.eliminarCanal();
                break;
            case ACCION_ELIMINAR_PLAN:
                this.eliminarPlan();
                break;
            case ACCION_ELIMINAR_PROVEEDOR:
                this.eliminarProveedor();
                break;
            default:
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, "Opción en desarrollo.");
                break;
        }
    }

    private void actualizarCanal() {
        CanalVistaPanel canalVista = this.mainFrame.getCanalVista();
        Canal canal = canalVista.getCanal();
        if (this.canalDAO.consultar(canal.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró la marca ingresada.");
        } else {
            this.canalDAO.actualizar(canal);
            canalVista.setCanales(this.canalDAO.consultar());
            canalVista.limpiarFormulario();
        }
    }

    private void actualizarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        if (this.proveedorDAO.consultar(proveedor.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al proveedor ingresado.");
        } else {
            this.proveedorDAO.actualizar(proveedor);
        }
    }

    private void actualizarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = planVista.getPlan();
        if (this.planDAO.consultar(plan.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el plan ingresado.");
        } else {
            this.planDAO.actualizar(plan);
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
        Object object = JOptionPane.showInputDialog(null, "Mensaje", "Título",
                0, null, planesRestantes.toArray(), null);
        if (object != null) {
            Plan plan = (Plan) object;
            canalVista.agregarPlan((Plan) plan);
        }
    }

    private void agregarMarca() {
        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        Marca marca = marcaVista.getMarca();
        Proveedor proveedor = marca.getProveedor();
        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el proveedor.");
        } else if (DBUtils.findById(Marca.class, proveedor.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado la marca.");
        } else {
            marca.setNumero(proveedor.getCodigo());
            marca.setFechaRegistro(new Date());
            DBUtils.save(marca);
        }
    }

    private void agregarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = planVista.getPlan();
        if (this.planDAO.consultar(plan.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el plan.");
        } else {
            this.planDAO.agregar(plan);
            planVista.limpiarFormulario();
            planVista.setPlanes(this.planDAO.consultar());
        }
    }

    private void agregarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        if (this.proveedorDAO.consultar(proveedor.getCodigo()) != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha registrado el proveedor.");
        } else {
            this.proveedorDAO.agregar(proveedor);
            proveedorVista.setProveedores(this.proveedorDAO.consultar());
        }
    }

    private void cargarVistas() {
        List<Canal> canales = this.canalDAO.consultar();
        List<Proveedor> proveedores = this.proveedorDAO.consultar();
        List<Marca> marcas = this.marcaDAO.consultar();
        List<Plan> planes = this.planDAO.consultar();

        MarcaVistaPanel marcaVista = this.mainFrame.getMarcaVista();
        marcaVista.setMarcas(marcas);
        marcaVista.setProveedores(proveedores);

        this.mainFrame.getProveedorVista().setMarcas(marcas);
        this.mainFrame.getCanalVista().setCanales(canales);
        this.mainFrame.getPlanVista().setPlanes(planes);
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

    private void consultarPlan() {
        Object objecto = JOptionPane.showInputDialog("Ingrese el código del plan:");
        if (objecto != null) {
            Integer codigo;
            try {
                codigo = Integer.parseInt(String.valueOf(objecto));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se permite buscar por números.");
                return;
            }
            PlanVistaPanel planVista = this.mainFrame.getPlanVista();
            Plan plan = this.planDAO.consultar(codigo);
            if (plan == null) {
                JOptionPane.showMessageDialog(null, "No se encontró el plan.");
            } else {
                planVista.setPlan(plan);
            }
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
            canalVista.setCanales(this.canalDAO.consultar());
        }
    }

    private void eliminarPlan() {
        PlanVistaPanel planVista = this.mainFrame.getPlanVista();
        Plan plan = this.planDAO.consultar(planVista.getPlan().getCodigo());
        if (plan == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el plan.");
        } else {
            this.planDAO.eliminar(plan);
            planVista.limpiarFormulario();
            planVista.setPlanes(this.planDAO.consultar());
        }
    }

    private void eliminarProveedor() {
        ProveedorVistaPanel proveedorVista = this.mainFrame.getProveedorVista();
        Proveedor proveedor = proveedorVista.getProveedor();
        if (this.proveedorDAO.consultar(proveedor.getCodigo()) == null) {
            JOptionPane.showMessageDialog(null, "No se encontró al proveedor ingresado.");
        } else if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el proveedor?") == 0) {
            this.proveedorDAO.eliminar(proveedor);
            proveedorVista.setProveedores(this.proveedorDAO.consultar());
        }
    }

    public void iniciarAplicacion() {
        this.cargarVistas();
        this.mainFrame.setVisible(true);
    }

}
