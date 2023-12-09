package com.example.querydsldynamic.comment.entity;

import com.example.querydsldynamic.member.entity.Member;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member author;

}
