package com.codegym.democ0221i1springboot.service.task;

import com.codegym.democ0221i1springboot.model.Task;
import com.codegym.democ0221i1springboot.repo.ITaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService implements ITaskService {
    @Autowired
    private ITaskRepo taskRepo;

    @Override
    public Iterable<Task> findAll() {
        return taskRepo.findAll();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
