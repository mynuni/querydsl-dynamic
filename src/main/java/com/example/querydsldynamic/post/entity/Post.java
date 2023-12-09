package com.example.querydsldynamic.post.entity;

import com.example.querydsldynamic.comment.entity.Comment;
import com.example.querydsldynamic.like.entity.Like;
import com.example.querydsldynamic.member.entity.Member;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member author;

    @OneToMany
    private List<Comment> comments;

    @OneToMany
    private List<Like> likes;

}
