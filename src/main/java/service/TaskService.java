package service;

import entity.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Task createTask(Task task);
}
