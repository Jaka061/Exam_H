package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "login", nullable = false,unique = true)
    private String login;
    @ManyToOne
    @JoinColumn(name = "post")
    private Posts posts;

    public Likes() {
    }

    public Likes(String login, Posts posts) {
        this.login = login;
        this.posts = posts;
    }
}
