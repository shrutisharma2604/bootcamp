package com.springbootcamp.springsecurity.Repositories;

import com.springbootcamp.springsecurity.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
