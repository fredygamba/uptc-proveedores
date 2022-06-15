package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 * Esta clase es la representación de una cuenta.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Cuenta implements Serializable {

    private Integer codigo;
    private String direccion;
    private String telefono;
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(Integer codigo, String direccion, String telefono) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cuenta(Integer codigo, String direccion, String telefono, Cliente cliente) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", direccion=" + direccion
                + ", telefono=" + telefono + ", cliente=" + cliente + '}';
    }

}
