package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Esta clase es la representación de un origen.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Origen implements Serializable {

    /**
     * Código o identificación del origen.
     */
    private Integer codigo;

    /**
     * Descripción del origen.
     */
    private String descripcion;

    /**
     * Productos asociados.
     */
    private Set<Producto> productos = new HashSet<>();

    public Origen() {
    }

    public Origen(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Origen{" + "codigo=" + codigo + ", descripcion="
                + descripcion + ", productos=" + productos + '}';
    }

}
