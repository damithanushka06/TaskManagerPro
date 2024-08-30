package com.example.taskmanagerpro.service;

import com.example.taskmanagerpro.entity.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Task createTask(Task task);
}
