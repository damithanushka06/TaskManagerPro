package com.example.taskmanagerpro.service;

import com.example.taskmanagerpro.entity.Task;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Task createTask(Task task);

    Task getTaskById(Integer id);

    Task updateTask(Integer id, String title);
}
