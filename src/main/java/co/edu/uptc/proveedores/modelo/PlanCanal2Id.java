/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author fredy
 */
public class PlanCanal2Id implements Serializable {

    private Integer codigoPlan;
    private Integer codigoCanal;

    public PlanCanal2Id() {
    }

    public PlanCanal2Id(Integer codigoPlan, Integer codigoCanal) {
        this.codigoPlan = codigoPlan;
        this.codigoCanal = codigoCanal;
    }

    public Integer getCodigoPlan() {
        return codigoPlan;
    }

    public void setCodigoPlan(Integer codigoPlan) {
        this.codigoPlan = codigoPlan;
    }

    public Integer getCodigoCanal() {
        return codigoCanal;
    }

    public void setCodigoCanal(Integer codigoCanal) {
        this.codigoCanal = codigoCanal;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + this.codigoPlan;
        hash = 37 * hash + this.codigoCanal;
        return hash;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof PlanCanal2Id)) {
            return false;
        }
        PlanCanal2Id aux = (PlanCanal2Id) objeto;
        return (this.getCodigoPlan() == aux.getCodigoPlan()
                && this.getCodigoCanal() == aux.getCodigoCanal());
    }

    @Override
    public String toString() {
        return "PlanCanal2Id{" + "codigoPlan=" + codigoPlan + ", codigoCanal=" + codigoCanal + '}';
    }

}
