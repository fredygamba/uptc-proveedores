/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.proveedores.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 * @param <T>
 */
public interface IGenericaDAO<T> {

    public void actualizar(T objeto) throws HibernateException;

    public Serializable agregar(T objeto) throws HibernateException;

    public T consultar(Serializable codigo) throws HibernateException;

    public List<T> consultar() throws HibernateException;

    public void eliminar(T objeto) throws HibernateException;

}
