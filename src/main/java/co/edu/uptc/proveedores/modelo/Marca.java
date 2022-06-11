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

    public Marca() {
    }

    public Marca(Integer numMarca, String nombre, Date fechaRegistro) {
        this.numero = numMarca;
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
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

    @Override
    public String toString() {
        return "Marca{" + "numMarca=" + numero + ", nombre="
                + nombre + ", fechaRegistro=" + fechaRegistro + '}';
    }

}
