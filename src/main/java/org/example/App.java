package org.example;

import org.example.db.GenericsDb;

import org.example.entity.Posts;
import org.example.entity.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


//        GenericsDb<User> userDb = new GenericsDb<>();
//        for (int i = 1; i <5 ; i++) {
//            User user = new User("user_" + i);
//            userDb.create(user);
//
//        }

        User user = new User("user1");
        User user1 = new User("user2");
        User user2 = new User("user3");
        User user3 = new User("user4");
        User user4 = new User("user5");

//        GenericsDb<Posts> postDb = new GenericsDb<>();
//        for (int i = 1; i < 2; i++) {
//            Posts posts = new Posts(user);
//            postDb.create(posts);
//        }
//
//        for (int i = 1; i < 5; i++) {
//            Posts posts = new Posts(user1);
//            postDb.create(posts);
//        }
//
//        for (int i = 1; i < 4; i++) {
//            Posts posts = new Posts(user2);
//            postDb.create(posts);
//        }
//        for (int i = 1; i < 3; i++) {
//            Posts posts = new Posts(user3);
//            postDb.create(posts);
//        }for (int i = 1; i < ; i++) {
//            Posts posts = new Posts(user4);
//            postDb.create(posts);
//        }
//
        GenericsDb<Posts> postDb = new GenericsDb<>();
        Posts posts = new Posts(user);
        Posts posts1 = new Posts(user);
        Posts posts2 = new Posts(user1);
        Posts posts3 = new Posts(user2);
        Posts posts4 = new Posts(user4);
        Posts posts5 = new Posts(user3);

        postDb.create(posts);
        postDb.create(posts1);
        postDb.create(posts2);
        postDb.create(posts3);
        postDb.create(posts4);
        postDb.create(posts5);





    }
}
