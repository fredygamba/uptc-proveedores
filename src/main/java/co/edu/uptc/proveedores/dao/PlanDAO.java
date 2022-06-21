/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Plan;
import co.edu.uptc.utils.DBUtils;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public class PlanDAO implements IGenericaDAO<Plan>{

    @Override
    public void actualizar(Plan plan) throws HibernateException {
        DBUtils.update(plan);
    }

    @Override
    public Integer agregar(Plan plan) throws HibernateException {
        return (Integer) DBUtils.save(plan);
    }

    @Override
    public Plan consultar(Serializable codigo) throws HibernateException {
        return DBUtils.findById(Plan.class, codigo);
    }

    @Override
    public List<Plan> consultar() throws HibernateException {
        return DBUtils.findAll(Plan.class);
    }

    @Override
    public void eliminar(Plan plan) throws HibernateException {
        DBUtils.delete(plan);
    }
    
}
