package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 * Esta clase es la representación de una cuenta.
 * 
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Cuenta implements Serializable {
    
    /**
     * Identificación o código de la cuenta.
     */
    private Integer codigo;
    
    /**
     * Dirección de la cuenta.
     */
    private String direccion;
    
    /**
     * Teléfono de contacto asociado a la cuenta.
     */
    private String telefono;

    public Cuenta() {
    }

    public Cuenta(Integer codigo, String direccion, String telefono) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", direccion=" + 
                direccion + ", telefono=" + telefono + '}';
    }
    
}