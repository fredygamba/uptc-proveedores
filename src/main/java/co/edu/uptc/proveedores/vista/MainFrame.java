/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.vista;

import co.edu.uptc.proveedores.controlador.ControladorPrincipal;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author fredy
 */
public class MainFrame extends JFrame {

    private final CanalVistaPanel canalVista;
    private final ClienteVistaPanel clienteVista;
    private final CuentaVistaPanel cuentaVista;
    private final MarcaVistaPanel marcaVista;
    private final OrigenVistaPanel origenVista;
    private final PlanVistaPanel planVista;
    private final ProductoVistaPanel productoVista;
    private final ProveedorVistaPanel proveedorVista;

    public MainFrame(ControladorPrincipal controladorPrincipal) {
        this.canalVista = new CanalVistaPanel(controladorPrincipal);
        this.clienteVista = new ClienteVistaPanel();
        this.cuentaVista = new CuentaVistaPanel();
        this.marcaVista = new MarcaVistaPanel(controladorPrincipal);
        this.origenVista = new OrigenVistaPanel();
        this.planVista = new PlanVistaPanel(controladorPrincipal);
        this.productoVista = new ProductoVistaPanel();
        this.proveedorVista = new ProveedorVistaPanel(controladorPrincipal);
        initProperties();
        initComponents();
    }

    public void initComponents() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        this.setContentPane(contentPanel);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        contentPanel.add(tabbedPane, BorderLayout.CENTER);
        tabbedPane.addTab("Proveedores", this.proveedorVista);
        tabbedPane.addTab("Marcas", this.marcaVista);
        tabbedPane.addTab("Canales", this.canalVista);
        tabbedPane.addTab("Planes", this.planVista);
        tabbedPane.addTab("Clientes", this.clienteVista);
        tabbedPane.addTab("Cuentas", this.cuentaVista);
        tabbedPane.addTab("Productos", this.productoVista);
        tabbedPane.addTab("Origenes", this.origenVista);
    }

    public void initProperties() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("Proveedores");
    }

    public CanalVistaPanel getCanalVista() {
        return canalVista;
    }
    
    public MarcaVistaPanel getMarcaVista() {
        return this.marcaVista;
    }

    public PlanVistaPanel getPlanVista() {
        return planVista;
    }
    
    public ProveedorVistaPanel getProveedorVista() {
        return proveedorVista;
    }
    
}
