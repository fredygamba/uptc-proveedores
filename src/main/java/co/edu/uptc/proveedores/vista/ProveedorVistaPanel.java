/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.vista;

import co.edu.uptc.proveedores.controlador.ControladorPrincipal;
import co.edu.uptc.proveedores.modelo.Marca;
import co.edu.uptc.proveedores.modelo.Proveedor;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fredy
 */
public class ProveedorVistaPanel extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;

    /**
     * Creates new form ProveedorVistaPanel
     */
    public ProveedorVistaPanel(ControladorPrincipal controladorPrincipal) {
        initComponents();
        initActions(controladorPrincipal);
        initTabla();
    }

    private void initActions(ControladorPrincipal controladorPrincipal) {
        this.btnActualizar.setActionCommand(ControladorPrincipal.ACCION_ACTUALIZAR_PROVEEDOR);
        this.btnAgregar.setActionCommand(ControladorPrincipal.ACCION_AGREGAR_PROVEEDOR);
        this.btnConsultar.setActionCommand(ControladorPrincipal.ACCION_CONSULTAR_PROVEEDOR);
        this.btnEliminar.setActionCommand(ControladorPrincipal.ACCION_ELIMINAR_PROVEEDOR);
        this.btnActualizar.addActionListener(controladorPrincipal);
        this.btnAgregar.addActionListener(controladorPrincipal);
        this.btnConsultar.addActionListener(controladorPrincipal);
        this.btnEliminar.addActionListener(controladorPrincipal);
    }

    private void initTabla() {
        this.defaultTableModel = new DefaultTableModel();
        this.defaultTableModel.addColumn("Código");
        this.defaultTableModel.addColumn("Descripción");
        this.defaultTableModel.addColumn("Contacto");
        this.defaultTableModel.addColumn("Teléfono");
        this.defaultTableModel.addColumn("Página web");
        this.defaultTableModel.addColumn("Marca");
        this.tablaProveedores.setModel(defaultTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        inputCodigo = new javax.swing.JSpinner();
        lblContacto = new javax.swing.JLabel();
        inputContacto = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblPaginaWeb = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        inputMarca = new javax.swing.JComboBox<>();
        inputPaginaWeb = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PROVEEDORES");

        lblCodigo.setText("Código:");

        lblContacto.setText("Contacto:");

        lblTelefono.setText("Marca:");

        lblPaginaWeb.setText("Teléfono:");

        lblMarca.setText("Página web:");

        lblDescripcion.setText("Descripción:");

        inputDescripcion.setColumns(10);
        inputDescripcion.setRows(1);
        jScrollPane1.setViewportView(inputDescripcion);

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaProveedores);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar);

        btnConsultar.setText("Consultar");
        jPanel1.add(btnConsultar);

        btnActualizar.setText("Actualizar");
        jPanel1.add(btnActualizar);

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPaginaWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCodigo)
                            .addComponent(inputContacto)
                            .addComponent(inputTelefono)
                            .addComponent(inputMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputPaginaWeb)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputCodigo)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputContacto)
                    .addComponent(lblContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JSpinner inputCodigo;
    private javax.swing.JTextField inputContacto;
    private javax.swing.JTextArea inputDescripcion;
    private javax.swing.JComboBox<Marca> inputMarca;
    private javax.swing.JTextField inputPaginaWeb;
    private javax.swing.JTextField inputTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPaginaWeb;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaProveedores;
    // End of variables declaration//GEN-END:variables

    public Proveedor getProveedor() {
        Proveedor proveedor = new Proveedor();
        proveedor.setCodigo((Integer) inputCodigo.getValue());
        proveedor.setContacto(inputContacto.getText());
        proveedor.setDescripcion(inputDescripcion.getText());
        proveedor.setPaginaWeb(inputPaginaWeb.getText());
        proveedor.setTelefono(inputTelefono.getText());
        proveedor.setMarca((Marca) inputMarca.getSelectedItem());
        return proveedor;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.defaultTableModel.setRowCount(0);
        for (Proveedor proveedor : proveedores) {
            this.defaultTableModel.addRow(new Object[]{proveedor.getCodigo(),
                proveedor.getContacto(), proveedor.getTelefono(),
                proveedor.getPaginaWeb(), proveedor.getDescripcion(),
                proveedor.getMarca() != null ? proveedor.getMarca().getNombre() : ""});
        }
    }

    public void setMarcas(List<Marca> marcas) {
        this.inputMarca.removeAllItems();
        this.inputMarca.addItem(null);
        for (Marca marca : marcas) {
            this.inputMarca.addItem(marca);
        }
    }

    public void setProveedor(Proveedor proveedor) {
        this.inputCodigo.setValue(proveedor.getCodigo());
        this.inputContacto.setText(proveedor.getContacto());
        this.inputDescripcion.setText(proveedor.getDescripcion());
        this.inputMarca.setSelectedItem(proveedor.getMarca());
        this.inputPaginaWeb.setText(proveedor.getPaginaWeb());
        this.inputTelefono.setText(proveedor.getTelefono());
        Marca marcaIndex;
        for (int i = 0; i < this.inputMarca.getItemCount(); i++) {
            marcaIndex = this.inputMarca.getItemAt(i);
            if (marcaIndex != null && marcaIndex.toString()
                    .equals(proveedor.getMarca().toString())) {
                inputMarca.setSelectedIndex(i);
                break;
            }
        }
    }

}