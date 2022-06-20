package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fredy
 */
public class Cliente implements Serializable {

    private Integer numero;
    private String nombres;
    private String apellidos;
    private String celular;
    private Cuenta cuenta;
    private Set<Cliente> referenciados = new HashSet<>();
    private Set<Cliente> referenciadoPor = new HashSet<>();

    public Cliente() {
    }

    public Cliente(Integer numero, String nombres, String apellidos, String celular) {
        this.numero = numero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
    }

    public Cliente(Integer numero, String nombres, String apellidos, String celular, Cuenta cuenta) {
        this.numero = numero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.cuenta = cuenta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Set<Cliente> getReferenciados() {
        return referenciados;
    }

    public void setReferenciados(Set<Cliente> referenciados) {
        this.referenciados = referenciados;
    }

    public Set<Cliente> getReferenciadoPor() {
        return referenciadoPor;
    }

    public void setReferenciadoPor(Set<Cliente> referenciadoPor) {
        this.referenciadoPor = referenciadoPor;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombres=" + nombres
                + ", apellidos=" + apellidos + ", celular=" + celular
                + ", cuenta=" + cuenta + '}';
    }

}
