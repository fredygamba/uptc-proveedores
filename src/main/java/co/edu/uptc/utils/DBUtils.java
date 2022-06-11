package co.edu.uptc.utils;

import co.edu.uptc.runners.Runner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Esta clase posee funciones útiles para el manejo con la base de datos.
 *
 * @author Fredy Alejandro Gamba Ortiz
 * @version 1.0
 */
public class DBUtils {

    private DBUtils() {
    }

    /**
     * Permite eliminar un registro.
     *
     * @param <T> Tipo de dato parametrizable.
     * @param type Tipo de dato a eliminar.
     * @param id Identifiación del registro asociado.
     */
    public static <T> void delete(Class<T> type, Serializable id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            Session session = sessionFactory.openSession();
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                Object object = session.get(type, id);
                session.delete(object);
                tx.commit();
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                session.close();
            }
        }
    }

    /**
     * Permite obtener todos los registros de una clase.
     *
     * @param <T> Tipo de dato parametrizable.
     * @param type Tipo de dato a obtener.
     * @return Lista de registros encontrados.
     */
    public static <T> List<T> findAll(Class<T> type) {
        List<T> objects = new ArrayList();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            Session sesion = sessionFactory.openSession();
            objects = sesion.createQuery("FROM " + type.getName()).list();
            sesion.close();
        }
        return objects;
    }

    /**
     * Permite obtener el registro asociado a su identicación.
     *
     * @param <T> Tipo de dato parametrizable.
     * @param type Tipo de dato a obtener.
     * @param id Identificación del registro a obtener.
     * @return Registro asociado a la identificación ingresada.
     */
    public static <T> T findById(Class<T> type, Serializable id) {
        T object = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            Session sesion = sessionFactory.openSession();
            object = (T) sesion.get(type, id);
            sesion.close();
        }
        return object;
    }

    /**
     * Permite guardar un registro.
     *
     * @param object Objeto que se desea guardar.
     * @return Devuelve la identificación del nuevo registro generado.
     */
    public static Object save(Object object) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Serializable id = null;
        if (sessionFactory != null) {
            Session sesion = sessionFactory.openSession();
            Transaction tx = null;
            try {
                tx = sesion.beginTransaction();
                id = sesion.save(object);
                tx.commit();
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                sesion.close();
            }
        }
        return id;
    }

    /**
     * Permite actualizar los valores de un registro.
     *
     * @param <T> Tipo de dato parametrizable.
     * @param object Objeto que se desea actualizar.
     */
    public static <T> void update(T object) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if (sessionFactory != null) {
            Session session = sessionFactory.openSession();
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                session.update(object);
                tx.commit();
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                session.close();
            }
        }
    }

}
