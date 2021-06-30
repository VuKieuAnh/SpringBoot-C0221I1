package com.codegym.democ0221i1springboot.controller;

import com.codegym.democ0221i1springboot.service.task.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private ITaskService taskService;

    @GetMapping()
    public ModelAndView findAlltask(){
        ModelAndView modelAndView = new ModelAndView("task/list");
        modelAndView.addObject("list", taskService.findAll());
        return modelAndView;
    }
}
