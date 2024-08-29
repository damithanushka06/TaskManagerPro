package service_impl;

import entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TaskRepository;
import service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Autowired
    private void setTaskRepository(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
}
