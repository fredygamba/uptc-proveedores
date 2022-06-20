/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.vista;

import co.edu.uptc.proveedores.controlador.ControladorPrincipal;
import co.edu.uptc.proveedores.modelo.Canal;
import co.edu.uptc.proveedores.modelo.Plan;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fredy
 */
public class PlanVistaPanel extends javax.swing.JPanel {

    private final DefaultListModel<String> defaultListModel;
    private DefaultTableModel defaultTableModel;
    private Set<Canal> canales;
    private Plan plan;

    /**
     * Creates new form PanelVistaPanel
     */
    public PlanVistaPanel(ControladorPrincipal controladorPrincipal) {
        initComponents();
        initActions(controladorPrincipal);
        initTabla();
        this.defaultListModel = new DefaultListModel<>();
        this.listaCanales.setModel(defaultListModel);
        this.canales = new HashSet<>();
    }

    private void initActions(ControladorPrincipal controladorPrincipal) {
        this.btnActualizar.setActionCommand(ControladorPrincipal.ACCION_ACTUALIZAR_PLAN);
        this.btnAgregar.setActionCommand(ControladorPrincipal.ACCION_AGREGAR_PLAN);
        this.btnAgregarCanal.setActionCommand(ControladorPrincipal.ACCION_AGREGAR_PLAN_CANAL);
        this.btnConsultar.setActionCommand(ControladorPrincipal.ACCION_CONSULTAR_PLAN);
        this.btnEliminar.setActionCommand(ControladorPrincipal.ACCION_ELIMINAR_PLAN);
        this.btnActualizar.addActionListener(controladorPrincipal);
        this.btnAgregar.addActionListener(controladorPrincipal);
        this.btnAgregarCanal.addActionListener(controladorPrincipal);
        this.btnConsultar.addActionListener(controladorPrincipal);
        this.btnEliminar.addActionListener(controladorPrincipal);
    }

    private void initTabla() {
        this.defaultTableModel = new DefaultTableModel();
        this.defaultTableModel.addColumn("Código");
        this.defaultTableModel.addColumn("Nombre");
        this.defaultTableModel.addColumn("Costo");
        this.defaultTableModel.addColumn("Canales");
        this.tablaPlanes.setModel(defaultTableModel);
    }

    public void limpiarFormulario() {
        this.plan = null;
        this.inputCosto.setValue(0);
        this.inputNombre.setText("");
        this.defaultListModel.removeAllElements();
        this.canales = new HashSet<>();
        this.defaultTableModel.setRowCount(0);
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
        lblNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        inputCosto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        btnEliminarCanal = new javax.swing.JButton();
        btnAgregarCanal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCanales = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPlanes = new javax.swing.JTable();
        inputCodigo = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLANES");

        lblNombre.setText("Nombre:");

        lblCosto.setText("Costo:");

        jLabel4.setText("Canales:");

        btnEliminarCanal.setText("-");
        btnEliminarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCanalActionPerformed(evt);
            }
        });

        btnAgregarCanal.setText("+");

        jScrollPane1.setViewportView(listaCanales);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar);

        btnConsultar.setText("Consultar");
        jPanel1.add(btnConsultar);

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar);

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar);

        tablaPlanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaPlanes);

        jLabel2.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarCanal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCanal))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblCosto)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNombre)
                            .addComponent(inputCosto)
                            .addComponent(inputCodigo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCosto)
                    .addComponent(inputCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarCanal)
                        .addComponent(btnAgregarCanal))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCanalActionPerformed
        // TODO add your handling code here:
        this.eliminarCanalSeleccionado();
    }//GEN-LAST:event_btnEliminarCanalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCanal;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCanal;
    private javax.swing.JSpinner inputCodigo;
    private javax.swing.JSpinner inputCosto;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> listaCanales;
    private javax.swing.JTable tablaPlanes;
    // End of variables declaration//GEN-END:variables

    public void agregarCanal(Canal canal) {
        this.canales.add(canal);
        this.defaultListModel.add(0, canal.getNombre());
    }

    public Plan getPlan() {
        Plan plan = new Plan();
        plan.setCodigo((Integer) this.inputCodigo.getValue());
        plan.setCanales(this.canales);
        plan.setCosto((Integer) this.inputCosto.getValue());
        plan.setNombre(this.inputNombre.getText());
        if (this.plan != null) {
            plan.setCodigo(this.plan.getCodigo());
        }
        return plan;
    }

    public void eliminarCanalSeleccionado() {
        int index = this.listaCanales.getSelectedIndex();
        if (index >= 0) {
            Canal canal = (Canal) this.canales.toArray()[index];
            this.canales.remove(canal);
            this.defaultListModel.remove(index);
        }
    }

    public void setPlanes(List<Plan> planes) {
        this.defaultTableModel.setRowCount(0);
        for (Plan plan : planes) {
            this.defaultTableModel.addRow(new Object[]{plan.getCodigo(),
                plan.getNombre(), plan.getCosto(), plan.getCanales().size()});
        }
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
        this.inputNombre.setText(plan.getNombre());
        this.inputCosto.setValue(plan.getCosto());
        this.canales = plan.getCanales();
        this.defaultListModel.removeAllElements();
        System.out.println(plan.getCanales().size());
        for (Canal canal : plan.getCanales()) {
            System.out.println(canal);
            this.defaultListModel.addElement(canal.getNombre());
        }
    }

}
