package com.example.taskmanagerpro.repository;

import com.example.taskmanagerpro.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
