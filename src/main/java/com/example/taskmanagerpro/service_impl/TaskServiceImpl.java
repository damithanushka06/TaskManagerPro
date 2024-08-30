package com.example.taskmanagerpro.service_impl;

import com.example.taskmanagerpro.entity.Task;
import com.example.taskmanagerpro.repository.TaskRepository;
import com.example.taskmanagerpro.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        Task savedTask = taskRepository.save(task);
        System.out.println("Task saved: " + savedTask);  // Debug line
        return savedTask;
    }

    @Autowired
    private void setTaskRepository(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
}
