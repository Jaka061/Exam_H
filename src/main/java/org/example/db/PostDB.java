package org.example.db;

import org.example.entity.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class PostDB {
    public  static Integer getIdLike(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Integer id = (Integer) session.createQuery("select Posts.id from Posts order by ");
        session.close();
        return id;
    }

    public static List<Posts> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Posts> posts = session.createQuery("FROM Posts order by  DESC ", ).list(); //HQL
        session.close();
        return
    }
}
