package com.socrates.repository;

import com.socrates.domain.Picture;
import com.socrates.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long>{
}
