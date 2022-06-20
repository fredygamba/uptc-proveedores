/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Cliente;
import co.edu.uptc.utils.DBUtils;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class ClienteDAO implements IGenericaDAO<Cliente> {
    
    @Override
    public void actualizar(Cliente cliente) throws HibernateException {
        DBUtils.update(cliente);
    }
    
    @Override
    public Integer agregar(Cliente cliente) throws HibernateException {
        return (Integer) DBUtils.save(cliente);
    }
    
    @Override
    public Cliente consultar(Integer codigo) throws HibernateException {
        return DBUtils.findById(Cliente.class, codigo);
    }
    
    @Override
    public List<Cliente> consultar() throws HibernateException {
        return DBUtils.findAll(Cliente.class);
    }
    
    @Override
    public void eliminar(Cliente cliente) throws HibernateException {
        DBUtils.delete(cliente);
    }
    
}
