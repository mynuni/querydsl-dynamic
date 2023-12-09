package com.example.querydsldynamic.follow.entity;

import com.example.querydsldynamic.member.entity.Member;

import javax.persistence.*;

@Entity
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member follower;

    @ManyToOne
    private Member followee;

}
