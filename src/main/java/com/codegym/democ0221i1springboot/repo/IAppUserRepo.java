package com.codegym.democ0221i1springboot.repo;

import com.codegym.democ0221i1springboot.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}
