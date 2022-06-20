package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;

/**
 *
 * @author fredy
 */
public class PlanCanal2 implements Serializable {

    private PlanCanal2Id id;
    private String otrosAtributos;

    public PlanCanal2() {
    }

    public PlanCanal2(PlanCanal2Id id, String otrosAtributos) {
        this.id = id;
        this.otrosAtributos = otrosAtributos;
    }

    public PlanCanal2Id getId() {
        return id;
    }

    public void setId(PlanCanal2Id id) {
        this.id = id;
    }

    public String getOtrosAtributos() {
        return otrosAtributos;
    }

    public void setOtrosAtributos(String otrosAtributos) {
        this.otrosAtributos = otrosAtributos;
    }

    @Override
    public String toString() {
        return "PlanCanal2{" + "id=" + id + ", otrosAtributos=" + otrosAtributos + '}';
    }

}
