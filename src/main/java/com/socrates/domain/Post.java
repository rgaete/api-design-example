package com.socrates.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @ManyToOne
    @JsonIgnore
    private User user;

    @OneToOne
    private Comment comment;

    @OneToMany
    private List<Tag> tags;

}