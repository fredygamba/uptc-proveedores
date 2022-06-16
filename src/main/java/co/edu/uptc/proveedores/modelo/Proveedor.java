package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 * Esta clase es la representación de un proveedor.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Proveedor implements Serializable {

    private Integer codigo;
    private String contacto;
    private String descripcion;
    private String paginaWeb;
    private String telefono;
    private Marca marca;

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

    public Proveedor(Integer codigo, String contacto, String descripcion,
            String paginaWeb, String telefono, Marca marca) {
        this.codigo = codigo;
        this.contacto = contacto;
        this.descripcion = descripcion;
        this.paginaWeb = paginaWeb;
        this.telefono = telefono;
        this.marca = marca;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", contacto: " + contacto
                + ", Descripcion: " + descripcion + ", Pagina web: " + paginaWeb
                + ", Teléfono: " + telefono + '}';
    }

}
