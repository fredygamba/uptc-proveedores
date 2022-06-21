/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Origen;
import co.edu.uptc.utils.DBUtils;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class OrigenDAO implements IGenericaDAO<Origen> {

    @Override
    public void actualizar(Origen origen) throws HibernateException {
        DBUtils.update(origen);
    }

    @Override
    public Integer agregar(Origen origen) throws HibernateException {
        return (Integer) DBUtils.save(origen);
    }

    @Override
    public Origen consultar(Serializable codigo) throws HibernateException {
        return DBUtils.findById(Origen.class, codigo);
    }

    @Override
    public List<Origen> consultar() throws HibernateException {
        return DBUtils.findAll(Origen.class);
    }

    @Override
    public void eliminar(Origen origen) throws HibernateException {
        DBUtils.delete(origen);
    }

}
