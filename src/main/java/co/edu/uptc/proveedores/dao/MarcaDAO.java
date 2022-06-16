/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Marca;
import co.edu.uptc.proveedores.modelo.Proveedor;
import co.edu.uptc.utils.DBUtils;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class MarcaDAO implements IGenericaDAO<Marca> {

    @Override
    public void actualizar(Marca marca) throws HibernateException {
        DBUtils.update(marca);
    }

    @Override
    public Integer agregar(Marca marca) throws HibernateException {
        return (Integer) DBUtils.save(marca);
    }

    @Override
    public Marca consultar(Integer codigo) throws HibernateException {
        return DBUtils.findById(Marca.class, codigo);
    }

    @Override
    public List<Marca> consultar() throws HibernateException {
        return DBUtils.findAll(Marca.class);
    }

    @Override
    public void eliminar(Marca marca) throws HibernateException {
        DBUtils.delete(marca);
    }

}
