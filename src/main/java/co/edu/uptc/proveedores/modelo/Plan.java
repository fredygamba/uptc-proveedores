package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Esta clase es la representación de una plan de televisión.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class Plan implements Serializable {

    private Integer codigo;
    private Set<Canal> canales = new HashSet<>();
    private Integer costo;
    private String nombre;

    public Plan() {
    }

    public Plan(Integer codigo, Integer costo, String nombre) {
        this.codigo = codigo;
        this.costo = costo;
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Set<Canal> getCanales() {
        return canales;
    }

    public void setCanales(Set<Canal> canales) {
        this.canales = canales;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Plan{" + "codigo=" + codigo + ", costo=" + costo
                + ", nombre=" + nombre + '}';
    }

}
