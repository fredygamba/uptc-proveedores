package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Esta clase es la representación de una canal de televisión.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Canal implements Serializable {

    private Integer codigo;
    private String logo;
    private String nombre;
    private Set<Plan> planes = new HashSet<>();

    /**
     * Tipo de canal.
     */
    private String tipo;

    public Canal() {
    }

    public Canal(Integer codigo, String logo, String nombre, String tipo) {
        this.codigo = codigo;
        this.logo = logo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(Set<Plan> planes) {
        this.planes = planes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Canal{" + "codigo=" + codigo + ", logo=" + logo + ", nombre="
                + nombre + ", tipo=" + tipo + '}';
    }

}
