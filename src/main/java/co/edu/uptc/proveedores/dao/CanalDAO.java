/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Canal;
import co.edu.uptc.utils.DBUtils;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class CanalDAO implements IGenericaDAO<Canal> {
    
    @Override
    public void actualizar(Canal canal) throws HibernateException {
        DBUtils.update(canal);
    }
    
    @Override
    public Integer agregar(Canal canal) throws HibernateException {
        return (Integer) DBUtils.save(canal);
    }
    
    @Override
    public Canal consultar(Integer codigo) throws HibernateException {
        return DBUtils.findById(Canal.class, codigo);
    }
    
    @Override
    public List<Canal> consultar() throws HibernateException {
        return DBUtils.findAll(Canal.class);
    }
    
    @Override
    public void eliminar(Canal canal) throws HibernateException {
        DBUtils.delete(canal);
    }
    
}
