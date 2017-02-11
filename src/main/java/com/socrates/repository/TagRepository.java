package com.socrates.repository;

import com.socrates.domain.Picture;
import com.socrates.domain.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag,Long>{
}
