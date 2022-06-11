package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Esta clase es la representación de una cuenta.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Marca implements Serializable {

    /**
     * Identificación o número de la marca.
     */
    private Integer numero;

    /**
     * Fecha de registro de la marca.
     */
    private Date fechaRegistro;

    /**
     * Nombre de la marca.
     */
    private String nombre;

    /**
     * Proveedor asociado.
     */
    private Proveedor proveedor;

    public Marca() {
    }

    public Marca(Integer numero, Date fechaRegistro, String nombre) {
        this.numero = numero;
        this.fechaRegistro = fechaRegistro;
        this.nombre = nombre;
    }

    public Marca(Integer numero, Date fechaRegistro, String nombre, Proveedor proveedor) {
        this.numero = numero;
        this.fechaRegistro = fechaRegistro;
        this.nombre = nombre;
        this.proveedor = proveedor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Marca{" + "numero=" + numero + ", fechaRegistro="
                + fechaRegistro + ", nombre=" + nombre + ", proveedor="
                + proveedor + '}';
    }

}
