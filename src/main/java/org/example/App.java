package org.example;

import org.example.db.GenericsDb;

import org.example.entity.Likes;
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
        Posts posts3 = new Posts(user1);
        Posts posts4 = new Posts(user1);
        Posts posts5 = new Posts(user2);
        Posts posts6 = new Posts(user2);
        Posts posts7 = new Posts(user4);
        Posts posts8 = new Posts(user4);
        Posts posts9 = new Posts(user4);
        Posts posts10 = new Posts(user3);
        Posts posts11 = new Posts(user3);
        Posts posts12 = new Posts(user3);

        postDb.create(posts);
        postDb.create(posts1);
        postDb.create(posts2);
        postDb.create(posts3);
        postDb.create(posts4);
        postDb.create(posts5);
        postDb.create(posts6);
        postDb.create(posts7);
        postDb.create(posts8);
        postDb.create(posts9);
        postDb.create(posts10);
        postDb.create(posts11);
        postDb.create(posts12);

        GenericsDb<Likes> likeDb = new GenericsDb<>();
        Likes likes = new Likes("login",posts);
        Likes likes1 = new Likes("login1",posts1);
        Likes likes2 = new Likes("login5",posts1);
        Likes likes3 = new Likes("login2",posts2);
        Likes likes4 = new Likes("login3",posts3);
        Likes likes5 = new Likes("login4",posts4);
        Likes likes6 = new Likes("login5",posts5);
        Likes likes7 = new Likes("login5",posts6);
        Likes likes8 = new Likes("login5",posts5);
        Likes likes9 = new Likes("login5",posts7);
        Likes likes10 = new Likes("login5",posts8);
        Likes likes11 = new Likes("login5",posts9);
        Likes likes12 = new Likes("login5",posts10);
        Likes likes14 = new Likes("login5",posts11);
        Likes likes15 = new Likes("login5",posts12);

likeDb.create(likes);
        likeDb.create(likes1);
        likeDb.create(likes2);
        likeDb.create(likes3);
        likeDb.create(likes4);
        likeDb.create(likes5);
        likeDb.create(likes6);
        likeDb.create(likes7);
        likeDb.create(likes8);
        likeDb.create(likes9);
        likeDb.create(likes10);
        likeDb.create(likes11);
        likeDb.create(likes12);
        likeDb.create(likes14);
        likeDb.create(likes15);

    }
}
