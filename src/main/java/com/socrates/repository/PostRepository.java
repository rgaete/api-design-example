package com.socrates.repository;

import com.socrates.domain.Picture;
import com.socrates.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "posts", collectionResourceRel = "posts")
public interface PostRepository extends CrudRepository<Post,Long>{
}
