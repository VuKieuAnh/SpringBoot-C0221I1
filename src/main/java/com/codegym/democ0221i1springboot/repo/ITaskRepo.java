package com.codegym.democ0221i1springboot.repo;

import com.codegym.democ0221i1springboot.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface ITaskRepo extends CrudRepository<Task, Long> {
}
