package com.example.taskmanagerpro.controller;

import com.example.taskmanagerpro.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.taskmanagerpro.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {


    private TaskService taskService;


    @PostMapping("/create")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @Autowired
    private void setTaskService(TaskService taskService){
        this.taskService = taskService;
    }
}
