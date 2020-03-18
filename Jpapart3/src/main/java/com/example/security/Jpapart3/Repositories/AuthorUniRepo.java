package com.example.security.Jpapart3.Repositories;

import com.example.security.Jpapart3.Entities.UniDirectional.AuthorUni;
import org.springframework.data.repository.CrudRepository;

public interface AuthorUniRepo extends CrudRepository<AuthorUni,Integer> {
}
