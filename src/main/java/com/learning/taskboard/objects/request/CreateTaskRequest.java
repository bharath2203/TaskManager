package com.learning.taskboard.objects.request;

import lombok.Data;

@Data
public class CreateTaskRequest {
    private String name;
    private String description;
    private Integer eta;
}
