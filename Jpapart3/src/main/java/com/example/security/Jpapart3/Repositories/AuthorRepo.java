package com.example.security.Jpapart3.Repositories;

import com.example.security.Jpapart3.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
