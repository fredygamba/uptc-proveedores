/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author fredy
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        initProperties();
        initComponents();
    }

    public void initComponents() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        this.setContentPane(contentPanel);

        JTabbedPane tabbedPane = new JTabbedPane();
        contentPanel.add(tabbedPane, BorderLayout.CENTER);

        ProveedorVista proveedorVista = new ProveedorVista();
        tabbedPane.addTab("Proveedores", proveedorVista);
    }

    public void initProperties() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Proveedores");
    }

}
