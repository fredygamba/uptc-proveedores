package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 *
 * @author fredy
 */
public class Producto implements Serializable {

    /**
     * Código o identificación del producto.
     */
    private Integer codigo;

    /**
     * Cargo del producto.
     */
    private Integer cargo;

    /**
     * Descripción del producto.
     */
    private String descripcion;

    /**
     * Código del origen asociado.
     */
    private Origen origen;

    /**
     * Tipo de producto.
     */
    private String tipoProducto;

    public Producto() {
    }

    public Producto(Integer codigo, Integer cargo, String descripcion, Origen origen, String tipoProducto) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.origen = origen;
        this.tipoProducto = tipoProducto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", cargo=" + cargo
                + ", descripcion=" + descripcion + ", origen=" + origen
                + ", tipoProducto=" + tipoProducto + '}';
    }

}
