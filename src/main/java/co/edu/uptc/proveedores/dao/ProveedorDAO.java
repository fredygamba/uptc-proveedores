/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Proveedor;
import co.edu.uptc.utils.DBUtils;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class ProveedorDAO implements IGenericaDAO<Proveedor> {

    @Override
    public void actualizar(Proveedor proveedor) throws HibernateException {
        DBUtils.update(proveedor);
    }

    @Override
    public Integer agregar(Proveedor proveedor) throws HibernateException {
        return (Integer) DBUtils.save(proveedor);
    }

    @Override
    public Proveedor consultar(Integer codigo) throws HibernateException {
        return DBUtils.findById(Proveedor.class, codigo);
    }

    @Override
    public List<Proveedor> consultar() throws HibernateException {
        return DBUtils.findAll(Proveedor.class);
    }

    @Override
    public void eliminar(Proveedor proveedor) throws HibernateException {
        DBUtils.delete(proveedor);
    }

}
