package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 * Esta clase es la representación de un proveedor.
 * 
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Proveedor implements Serializable {

    /**
     * Código o identificación del proveedor.
     */
    private Integer codigo;
    
    /**
     * Contacto asociado al proveedor.
     */
    private String contacto;
    
    /**
     * Descripción del proveedor.
     */
    private String descripcion;
    
    /**
     * Página web del proveedor.
     */
    private String paginaWeb;
    
    /**
     * Teléfono de contacto del proveedor.
     */
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(Integer codigo, String descripcion, String paginaWeb, 
            String telefono, String contacto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.paginaWeb = paginaWeb;
        this.telefono = telefono;
        this.contacto = contacto;
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

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigo=" + codigo + ", descripcion=" + 
                descripcion + ", paginaWeb=" + paginaWeb + ", telefono=" + 
                telefono + ", contacto=" + contacto + '}';
    }

}
