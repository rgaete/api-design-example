package com.socrates.repository;

import com.socrates.domain.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PictureRepository extends CrudRepository<Picture,Long>{
}
