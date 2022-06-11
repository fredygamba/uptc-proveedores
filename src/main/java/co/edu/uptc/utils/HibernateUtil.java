/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author fredy
 */
public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory buildSessionFactory() {
        SessionFactory session = null;
        try {
            session = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            String log = "Se generó un error al construir la sessión hibernate.";
            Logger.getLogger(HibernateUtil.class.getName()).log(Level.SEVERE, log, e);
        }
        return session;
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

}
