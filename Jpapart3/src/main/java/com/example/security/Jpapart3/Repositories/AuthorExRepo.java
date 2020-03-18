package com.example.security.Jpapart3.Repositories;

import com.example.security.Jpapart3.Entities.OneToOne.AuthorEx;
import org.springframework.data.repository.CrudRepository;

public interface AuthorExRepo extends CrudRepository<AuthorEx,Integer> {
}
