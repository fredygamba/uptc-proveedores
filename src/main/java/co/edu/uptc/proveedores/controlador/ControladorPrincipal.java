/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.controlador;

import co.edu.uptc.proveedores.vista.OrigenProductoVista;
import co.edu.uptc.proveedores.vista.PlanCanalVista;
import co.edu.uptc.proveedores.vista.ProveedorMarcaVista;
import co.edu.uptc.proveedores.vista.ProveedorVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fredy
 */
public class ControladorPrincipal implements ActionListener {

    public static final String ACTION_PROVEEDOR = "formProveedor";
    public static final String ACTION_PROVEEDOR_MARCA = "formProveedorMarca";
    public static final String ACTION_PLAN_CANAL = "formPlanCanal";
    public static final String ACTION_ORIGEN_PRODUCTO = "formOrigenProducto";

    private ProveedorVista proveedorVista;
    private ProveedorMarcaVista proveedorMarcaVista;
    private PlanCanalVista planCanalVista;
    private OrigenProductoVista origenProductoVista;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()) {
            case ACTION_PROVEEDOR:
                System.out.println("Aqui..");
                this.proveedorVista = new ProveedorVista();
                this.proveedorVista.setVisible(true);
                break;
            case ACTION_PROVEEDOR_MARCA:
                this.proveedorMarcaVista = new ProveedorMarcaVista();
                this.proveedorMarcaVista.setVisible(true);
                break;
            case ACTION_PLAN_CANAL:
                this.planCanalVista = new PlanCanalVista();
                this.planCanalVista.setVisible(true);
                break;
            case ACTION_ORIGEN_PRODUCTO:
                this.origenProductoVista = new OrigenProductoVista();
                this.origenProductoVista.setVisible(true);
                break;
            default:
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, "Opción en desarrollo.");
                break;
        }
    }

}
