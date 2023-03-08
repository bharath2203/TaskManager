package com.learning.taskboard.mappers;

import com.learning.taskboard.entity.Task;
import com.learning.taskboard.objects.request.CreateTaskRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {

    public TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    Task map(CreateTaskRequest createTaskRequest);

}
