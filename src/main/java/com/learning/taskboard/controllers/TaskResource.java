package com.learning.taskboard.controllers;

import com.learning.taskboard.entity.Task;
import com.learning.taskboard.objects.request.CreateTaskRequest;
import com.learning.taskboard.objects.response.Response;
import com.learning.taskboard.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskResource {

    private final TaskService taskService;

    public TaskResource(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getTaskList() {
        return taskService.getAllTasks();
    }

    @PostMapping("/task")
    public Response<String> createTask(@RequestBody CreateTaskRequest createTaskRequest) {
        String taskId = taskService.createTask(createTaskRequest);
        return Response.success(taskId);
    }
}
