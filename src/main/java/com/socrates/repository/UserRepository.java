package com.socrates.repository;

import com.socrates.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{
}
