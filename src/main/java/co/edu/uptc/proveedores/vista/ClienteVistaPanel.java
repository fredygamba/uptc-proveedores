/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.vista;

import co.edu.uptc.proveedores.controlador.ControladorPrincipal;
import co.edu.uptc.proveedores.modelo.Cliente;
import co.edu.uptc.proveedores.modelo.Cuenta;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fredy
 */
public class ClienteVistaPanel extends javax.swing.JPanel {

    private final DefaultTableModel modelClientes;
    private final DefaultListModel modelReferenciados;
    private final DefaultListModel modelReferenciadosPor;
    private Set<Cliente> referenciados;

    /**
     * Creates new form ClienteVistaPanel
     */
    public ClienteVistaPanel(ControladorPrincipal controladorPrincipal) {
        initComponents();
        this.initActions(controladorPrincipal);
        this.modelClientes = new DefaultTableModel();
        this.modelClientes.setColumnIdentifiers(new String[]{
            "Número", "Nombres", "Apellidos", "Celular", "Cuenta"});
        this.tableClientes.setModel(modelClientes);
        this.modelReferenciados = new DefaultListModel();
        this.listReferenciados.setModel(modelReferenciados);
        this.referenciados = new HashSet<>();
        this.modelReferenciadosPor = new DefaultListModel();
        this.listReferenciadosPor.setModel(modelReferenciadosPor);
    }

    private void initActions(ControladorPrincipal controladorPrincipal) {
        this.btnActualizar.setActionCommand(ControladorPrincipal.ACCION_ACTUALIZAR_CLIENTE);
        this.btnAgregar.setActionCommand(ControladorPrincipal.ACCION_AGREGAR_CLIENTE);
        this.btnAgregarReferenciado.setActionCommand(ControladorPrincipal.ACCION_AGREGAR_REFERENCIADO);
        this.btnConsultar.setActionCommand(ControladorPrincipal.ACCION_CONSULTAR_CLIENTE);
        this.btnEliminar.setActionCommand(ControladorPrincipal.ACCION_ELIMINAR_CLIENTE);
        this.btnActualizar.addActionListener(controladorPrincipal);
        this.btnAgregar.addActionListener(controladorPrincipal);
        this.btnAgregarReferenciado.addActionListener(controladorPrincipal);
        this.btnConsultar.addActionListener(controladorPrincipal);
        this.btnEliminar.addActionListener(controladorPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        inputNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        inputApellidos = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        inputCelular = new javax.swing.JTextField();
        lblCuenta = new javax.swing.JLabel();
        inputCuenta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listReferenciados = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listReferenciadosPor = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btnAgregarReferenciado = new javax.swing.JButton();
        inputNumero = new javax.swing.JSpinner();
        lblNumero = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES");

        lblNombres.setText("Nombres:");

        lblApellidos.setText("Apellidos:");

        lblCelular.setText("Celular:");

        lblCuenta.setText("Cuenta:");

        jLabel6.setText("Referenciados:");

        jScrollPane2.setViewportView(listReferenciados);

        jLabel7.setText("Referenciados por:");

        jScrollPane3.setViewportView(listReferenciadosPor);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnAgregar.setText("Agregar");
        jPanel2.add(btnAgregar);

        btnConsultar.setText("Consultar");
        jPanel2.add(btnConsultar);

        btnActualizar.setText("Actualizar");
        jPanel2.add(btnActualizar);

        btnEliminar.setText("Eliminar");
        jPanel2.add(btnEliminar);

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableClientes);

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnAgregarReferenciado.setText("+");

        lblNumero.setText("Número");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarReferenciado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(lblCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNombres)
                            .addComponent(inputApellidos)
                            .addComponent(inputCelular)
                            .addComponent(inputCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNumero))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputNumero)
                    .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputApellidos)
                    .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputCelular)
                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputCuenta)
                    .addComponent(lblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btnAgregarReferenciado)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(589, 589, 589))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.eliminarReferenciado();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarReferenciado;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField inputApellidos;
    private javax.swing.JTextField inputCelular;
    private javax.swing.JComboBox<Cuenta> inputCuenta;
    private javax.swing.JTextField inputNombres;
    private javax.swing.JSpinner inputNumero;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JList<String> listReferenciados;
    private javax.swing.JList<String> listReferenciadosPor;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables

    public void eliminarReferenciado() {
        int index = this.listReferenciados.getSelectedIndex();
        if (index >= 0) {
            Cliente cliente = (Cliente) this.referenciados.toArray()[index];
            this.referenciados.remove(cliente);
            this.modelReferenciados.remove(index);
        }
    }

    public void limpiarFormulario() {
        this.inputApellidos.setText("");
        this.inputNombres.setText("");
        this.inputNumero.setValue(0);
        this.inputCelular.setText("");
        this.inputCuenta.setSelectedItem(null);
        this.modelReferenciados.removeAllElements();
        this.referenciados = new HashSet<>();
    }

    public Cliente getCliente() {
        Cliente cliente = new Cliente();
        cliente.setApellidos(this.inputApellidos.getText());
        cliente.setNombres(this.inputNombres.getText());
        cliente.setCelular(this.inputCelular.getText());
        cliente.setNumero((Integer) this.inputNumero.getValue());
        cliente.setReferenciados(this.referenciados);
        Object cuenta = this.inputCuenta.getSelectedItem();
        if (cuenta != null) {
            cliente.setCuenta((Cuenta) cuenta);
        }
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.modelReferenciados.removeAllElements();
        this.referenciados = new HashSet<>();
        this.inputNumero.setValue(cliente.getNumero());
        this.inputCelular.setText(cliente.getCelular());
        this.inputNombres.setText(cliente.getNombres());
        this.inputApellidos.setText(cliente.getApellidos());
        Cuenta cuenta = cliente.getCuenta();
        if (cuenta != null) {
            Cuenta cuentaIndex;
            for (int i = 0; i < this.inputCuenta.getItemCount(); i++) {
                cuentaIndex = this.inputCuenta.getItemAt(i);
                if (cuentaIndex != null && cuentaIndex.getCodigo().equals(cuenta.getCodigo())) {
                    this.inputCuenta.setSelectedIndex(i);
                    break;
                }
            }
        }
        this.referenciados = cliente.getReferenciados();
        for (Cliente referenciado : referenciados) {
            this.modelReferenciados.addElement(referenciado.getNombres());
        }
        Set<Cliente> referenciadosPor = cliente.getReferenciadoPor();
        for (Cliente referenciado : referenciadosPor) {
            this.modelReferenciadosPor.addElement(referenciado.getNombres());
        }
    }

    public void setClientes(List<Cliente> clientes) {
        this.modelClientes.setRowCount(0);
        Cuenta cuenta;
        for (Cliente cliente : clientes) {
            cuenta = cliente.getCuenta();
            this.modelClientes.addRow(new Object[]{cliente.getNumero(),
                cliente.getNombres(), cliente.getApellidos(),
                cliente.getCelular(), cuenta != null ? cuenta.getCodigo() : ""});
        }
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.inputCuenta.removeAllItems();
        this.inputCuenta.addItem(null);
        for (Cuenta cuenta : cuentas) {
            this.inputCuenta.addItem(cuenta);
        }
    }

    public void agregarReferenciado(Cliente cliente) {
        this.referenciados.add(cliente);
        this.modelReferenciados.addElement(cliente.getNombres());
    }

}
