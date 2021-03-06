/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.vista;

import co.edu.uptc.proveedores.controlador.ControladorPrincipal;
import co.edu.uptc.proveedores.modelo.Cliente;
import co.edu.uptc.proveedores.modelo.Cuenta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fredy
 */
public class CuentaVistaPanel extends javax.swing.JPanel {

    private DefaultTableModel modelCuentas;

    /**
     * Creates new form CuentaVistaPanel
     */
    public CuentaVistaPanel(ControladorPrincipal controladorPrincipal) {
        initComponents();
        this.initActions(controladorPrincipal);
        this.modelCuentas = new DefaultTableModel();
        this.tableCuentas.setModel(modelCuentas);
        this.modelCuentas.setColumnIdentifiers(new String[]{
            "Código", "Cliente", "Dirección", "Teléfono"});
    }

    private void initActions(ControladorPrincipal controladorPrincipal) {
        this.btnActualizar.addActionListener(controladorPrincipal);
        this.btnAgregar.addActionListener(controladorPrincipal);
        this.btnConsultar.addActionListener(controladorPrincipal);
        this.btnEliminar.addActionListener(controladorPrincipal);
        this.btnActualizar.setActionCommand(ControladorPrincipal.ACCION_ACTUALIZAR_CUENTA);
        this.btnAgregar.setActionCommand(ControladorPrincipal.ACCION_AGREGAR_CUENTA);
        this.btnConsultar.setActionCommand(ControladorPrincipal.ACCION_CONSULTAR_CUENTA);
        this.btnEliminar.setActionCommand(ControladorPrincipal.ACCION_ELIMINAR_CUENTA);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        inputCodigo = new javax.swing.JSpinner();
        lblDireccion = new javax.swing.JLabel();
        inputDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        inputCliente = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCuentas = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUENTAS");

        lblCodigo.setText("Código:");

        lblDireccion.setText("Dirección:");

        lblTelefono.setText("Teléfono:");

        lblCliente.setText("Cliente:");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar);

        btnConsultar.setText("Consultar");
        jPanel1.add(btnConsultar);

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar);

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar);

        tableCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableCuentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCodigo)
                            .addComponent(inputDireccion)
                            .addComponent(inputTelefono)
                            .addComponent(inputCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputDireccion)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTelefono)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputCliente)
                    .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Cliente> inputCliente;
    private javax.swing.JSpinner inputCodigo;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tableCuentas;
    // End of variables declaration//GEN-END:variables

    public Cuenta getCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setCodigo((Integer) this.inputCodigo.getValue());
        cuenta.setDireccion(this.inputDireccion.getText());
        cuenta.setTelefono(this.inputTelefono.getText());
        Object cliente = this.inputCliente.getSelectedItem();
        if (cliente != null) {
            cuenta.setCliente((Cliente) cliente);
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.inputCodigo.setValue(cuenta.getCodigo());
        this.inputDireccion.setText(cuenta.getDireccion());
        this.inputTelefono.setText(cuenta.getTelefono());
        Cliente cliente = cuenta.getCliente();
        if (cliente != null) {
            Cliente clienteIndex;
            for (int i = 0; i < this.inputCliente.getItemCount(); i++) {
                clienteIndex = this.inputCliente.getItemAt(i);
                if (clienteIndex != null && clienteIndex.getNumero()
                        .equals(cliente.getNumero())) {
                    this.inputCliente.setSelectedIndex(i);
                    break;
                }
            }
        }
    }

    public void limpiarFormulario() {
        this.inputCodigo.setValue(0);
        this.inputDireccion.setText("");
        this.inputTelefono.setText("");
        this.inputCliente.setSelectedItem(null);
    }

    public void setClientes(List<Cliente> clientes) {
        this.inputCliente.removeAllItems();
        this.inputCliente.addItem(null);
        for (Cliente cliente : clientes) {
            this.inputCliente.addItem(cliente);
        }
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.modelCuentas.setRowCount(0);
        Cliente cliente;
        String clienteNombre;
        for (Cuenta cuenta : cuentas) {
            cliente = cuenta.getCliente();
            clienteNombre = cliente != null ? cliente.getNombres() : "";
            this.modelCuentas.addRow(new Object[]{cuenta.getCodigo(),
                clienteNombre, cuenta.getDireccion(), cuenta.getTelefono()});
        }
    }

}
