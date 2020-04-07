package org.example.db;

import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class UserDb {
    public static List<User> getByName() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<User> users = session.createQuery("From org.example.entity.User u order by u.login desc ",User.class).list();
        session.close();
        return users ;
    }
    public static Integer getById() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Integer id = (Integer) session.createQuery("select User.id from User order by ").getSingleResult();
        session.close();
        return id;
    }
    public  static Integer getIdMaxLikedNum(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Integer id = (Integer) session.createQuery("select User.id from User order by ").getSingleResult();
        session.close();
        return id;
    }

}
