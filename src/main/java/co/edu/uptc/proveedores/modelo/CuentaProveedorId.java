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
public class CuentaProveedorId implements Serializable {
 
    private Integer codigoProveedor;
    private Integer codigoCuenta;

    public CuentaProveedorId() {
    }

    public CuentaProveedorId(Integer codigoProveedor, Integer codigoCuenta) {
        this.codigoProveedor = codigoProveedor;
        this.codigoCuenta = codigoCuenta;
    }

    public Integer getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Integer codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Integer getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(Integer codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigoProveedor);
        hash = 97 * hash + Objects.hashCode(this.codigoCuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaProveedorId other = (CuentaProveedorId) obj;
        return true;
    }

    

    @Override
    public String toString() {
        return "CuentaProveedorId{" + "codigoProveedor=" + codigoProveedor + ", codigoCuenta=" + codigoCuenta + '}';
    }
    
    
}