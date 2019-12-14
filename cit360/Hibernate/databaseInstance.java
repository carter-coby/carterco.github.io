/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author cobyc
 */
public class databaseInstance {
    SessionFactory factory = null;
    Session session = null;
    
    private static databaseInstance instance = null;
    
    private databaseInstance()
            {
                factory = HibernateUtil.getSessionFactory();
            }
    
    public static databaseInstance getInstance()
    {
        if (instance == null)
        {
            instance = new databaseInstance();
        }
        return instance;
    }
    
    public List<Actor> getActors()
    {
        try
        {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Actor";
            List<Actor> actors = (List<Actor>)session.createQuery(sql).list();
            session.getTransaction().commit();
            return actors;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
        finally
        {
            session.close();
        }
    }
    
    public Actor getActor(int id)
    {
        try
        {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Actor where id=" + Integer.toString(id);
            Actor actor = (Actor)session.createQuery(sql).uniqueResult();
            session.getTransaction().commit();
            return actor;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
        finally
        {
            session.close();
        }
    }
    
    public void closeSession()
    {
        factory.close();
    }
}
