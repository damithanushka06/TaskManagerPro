package com.example.taskmanagerpro.service_impl;

import com.example.taskmanagerpro.entity.Task;
import com.example.taskmanagerpro.repository.TaskRepository;
import com.example.taskmanagerpro.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        Task savedTask = taskRepository.save(task);
        System.out.println("Task saved: " + savedTask);  // Debug line
        return savedTask;
    }

    @Override
    public Task getTaskById(Integer id) {
        try {
            Optional<Task> task = taskRepository.findById(id);
            return task.get();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Task updateTask(Integer id, String newTitle){
        try {
            Optional<Task> task = taskRepository.findById(id);
            task.get().setTitle(newTitle);
            return taskRepository.save(task.get());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }


    @Autowired
    private void setTaskRepository(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
}
