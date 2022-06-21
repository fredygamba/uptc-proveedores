/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Cuenta;
import co.edu.uptc.utils.DBUtils;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class CuentaDAO implements IGenericaDAO<Cuenta> {
    
    @Override
    public void actualizar(Cuenta cuenta) throws HibernateException {
        DBUtils.update(cuenta);
    }
    
    @Override
    public Integer agregar(Cuenta cuenta) throws HibernateException {
        return (Integer) DBUtils.save(cuenta);
    }
    
    @Override
    public Cuenta consultar(Serializable codigo) throws HibernateException {
        return DBUtils.findById(Cuenta.class, codigo);
    }
    
    @Override
    public List<Cuenta> consultar() throws HibernateException {
        return DBUtils.findAll(Cuenta.class);
    }
    
    @Override
    public void eliminar(Cuenta cuenta) throws HibernateException {
        DBUtils.delete(cuenta);
    }
    
}
