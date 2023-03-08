package com.learning.taskboard.service;

import com.learning.taskboard.entity.Task;
import com.learning.taskboard.mappers.TaskMapper;
import com.learning.taskboard.objects.request.CreateTaskRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class TaskService {

    Map<String, Task> database;

    public TaskService() {
        database = new HashMap<>();
    }

    public String createTask(CreateTaskRequest createTaskRequest) {
        String taskId = UUID.randomUUID().toString();
        Task task = TaskMapper.INSTANCE.map(createTaskRequest);
        task.setTaskId(taskId);
        task.setCompleted(false);
        database.put(taskId, task);
        return taskId;
    }

    public List<Task> getAllTasks() {
        return database.values().stream().toList();
    }
}
