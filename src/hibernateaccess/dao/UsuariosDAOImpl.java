/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateaccess.dao;

import hibernateaccess.domini.Usuarios;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import hibernateaccess.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author professor
 */
public class UsuariosDAOImpl implements UsuariosDAO {

    @Override
    public List<Usuarios> getUsuario() {
        List<Usuarios> totsElsClients = null;
        Session sesio = HibernateUtil.getSessionFactory().openSession();
        try {
            sesio.beginTransaction();
            CriteriaBuilder cb = sesio.getCriteriaBuilder();
            CriteriaQuery<Usuarios> criteria = cb.createQuery(Usuarios.class);
            Root<Usuarios> from = criteria.from(Usuarios.class);
            criteria.select(from);
            TypedQuery<Usuarios> query = sesio.createQuery(criteria);
            //Criteria criteria = sesio.createCriteria(Usuarios.class);
            totsElsClients = query.getResultList();
            sesio.getTransaction().commit();
        } catch (HibernateException ex) {
            System.out.println("Error en la consulta");
        }
        sesio.close();
        return totsElsClients;        
    }

    @Override
    public Usuarios getUsuarioPerDowId(String dowId) {
        Usuarios client = null;
        Session sesio = HibernateUtil.getSessionFactory().openSession();
        try {
            sesio.beginTransaction();
            CriteriaBuilder cb = sesio.getCriteriaBuilder();
            CriteriaQuery<Usuarios> criteria = cb.createQuery(Usuarios.class);
            Root<Usuarios> from = criteria.from(Usuarios.class);
            criteria.select(from);
            criteria.where(cb.equal(from.get("dowId"), dowId));
            TypedQuery<Usuarios> query = sesio.createQuery(criteria);
            client = query.getSingleResult();

            /*Criteria criteria = sesio.createCriteria(Usuarios.class);
            criteria.add(Restrictions.eq("CUSTOMER_ID",idClient));
            client = (Usuarios) criteria.list().get(0);*/
            sesio.getTransaction().commit();
        } catch (HibernateException ex) {
            System.out.println("Error en la consulta");
        }
        sesio.close();
        return client;        
    }

    @Override
    public void inserirUsuario(Usuarios client) {
        Session sesio = HibernateUtil.getSessionFactory().openSession();
        try {
            sesio.beginTransaction();
            sesio.save(client);
            sesio.getTransaction().commit();
        } catch (HibernateException ex) {
            System.out.println("Error en la inserció");
            sesio.getTransaction().rollback();
        }        
        sesio.close();
    }

    @Override
    public void modificarUsuario(Usuarios client) {
        Session sesio = HibernateUtil.getSessionFactory().openSession();
        try {
            sesio.beginTransaction();
            sesio.update(client);
            sesio.getTransaction().commit();
        } catch (HibernateException ex) {
            System.out.println("Error en la actualització");
            sesio.getTransaction().rollback();
        }        
        sesio.close();
    }

    @Override
    public void eliminarUsuario(Usuarios client) {
        Session sesio = HibernateUtil.getSessionFactory().openSession();
        try {
            sesio.beginTransaction();
            sesio.delete(client);
            sesio.getTransaction().commit();
        } catch (HibernateException ex) {
            System.out.println("Error en la eliminació");
            sesio.getTransaction().rollback();
        }        
        sesio.close();
    }
    
}
