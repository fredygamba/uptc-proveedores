/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.CuentaProveedor;
import co.edu.uptc.proveedores.modelo.CuentaProveedorId;
import co.edu.uptc.utils.DBUtils;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class CuentaProveedorDAO implements IGenericaDAO<CuentaProveedor>{

    @Override
    public void actualizar(CuentaProveedor cuentaProveedor) throws HibernateException {
        DBUtils.update(cuentaProveedor);
    }

    @Override
    public CuentaProveedorId agregar(CuentaProveedor cuentaProveedor) throws HibernateException {
        return (CuentaProveedorId) DBUtils.save(cuentaProveedor);
    }

    @Override
    public CuentaProveedor consultar(Serializable codigo) throws HibernateException {
        return DBUtils.findById(CuentaProveedor.class, codigo);
    }

    @Override
    public List<CuentaProveedor> consultar() throws HibernateException {
        return DBUtils.findAll(CuentaProveedor.class);
    }

    @Override
    public void eliminar(CuentaProveedor cuentaProveedor) throws HibernateException {
        DBUtils.delete(cuentaProveedor);
    }
    
}
