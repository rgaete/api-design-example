package com.socrates.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String login;

    @OneToMany(mappedBy = "user")
    @JsonProperty("posts")
    private List<Post> posts;

}
