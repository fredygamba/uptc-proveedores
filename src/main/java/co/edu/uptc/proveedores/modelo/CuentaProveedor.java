package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 *
 * @author fredy
 */
public class CuentaProveedor implements Serializable {

    private CuentaProveedorId id;
    private Plan plan;
    private Producto producto;

    public CuentaProveedor() {
    }

    public CuentaProveedor(CuentaProveedorId id, Plan plan, Producto producto) {
        this.id = id;
        this.plan = plan;
        this.producto = producto;
    }

    public CuentaProveedorId getId() {
        return id;
    }

    public void setId(CuentaProveedorId id) {
        this.id = id;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "CuentaProveedor{" + "id=" + id + '}';
    }

}
