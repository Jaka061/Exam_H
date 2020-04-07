package org.example.db;

import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class GenericsDb<T> {
    public T create(T t){
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }
}
