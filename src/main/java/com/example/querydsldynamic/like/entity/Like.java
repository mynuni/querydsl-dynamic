package com.example.querydsldynamic.like.entity;

import com.example.querydsldynamic.member.entity.Member;

import javax.persistence.*;

@Entity
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

}
