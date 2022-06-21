/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Producto;
import co.edu.uptc.utils.DBUtils;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class ProductoDAO implements IGenericaDAO<Producto>{

    @Override
    public void actualizar(Producto producto) throws HibernateException {
        DBUtils.update(producto);
    }

    @Override
    public Integer agregar(Producto producto) throws HibernateException {
        return (Integer) DBUtils.save(producto);
    }

    @Override
    public Producto consultar(Serializable codigo) throws HibernateException {
        return DBUtils.findById(Producto.class, codigo);
    }

    @Override
    public List<Producto> consultar() throws HibernateException {
        return DBUtils.findAll(Producto.class);
    }

    @Override
    public void eliminar(Producto producto) throws HibernateException {
        DBUtils.delete(producto);
    }
    
}
