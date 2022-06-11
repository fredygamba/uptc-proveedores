package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

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

    @Override
    public String toString() {
        return "Origen{" + "codigo=" + codigo
                + ", descripcion=" + descripcion + '}';
    }

}
