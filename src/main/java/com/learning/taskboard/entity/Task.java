package com.learning.taskboard.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Task {
    private String taskId;
    private String name;
    private String description;
    private Integer eta;
    private Boolean completed;
}
