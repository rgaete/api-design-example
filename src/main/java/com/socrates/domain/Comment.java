package com.socrates.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @OneToOne
    private Picture picture;

    @ManyToOne
    private User user;
}
