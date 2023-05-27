package com.task_manager_sudy_project.task_manager_study_project.dao;

import com.task_manager_sudy_project.task_manager_study_project.Util.Generator;
import com.task_manager_sudy_project.task_manager_study_project.model.TaskItem;
import com.task_manager_sudy_project.task_manager_study_project.model.TaskType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.Random;

@Component
@RequiredArgsConstructor
public class TaskItemDao {
    private final Generator generator;
    private static final Random RND = new Random();
    public TaskItem makeTask(TaskType taskType) {
        Generator generator = Generator.getInstance();
        return TaskItem.builder()
                .type(taskType)
                .name(generator.makeName())
                .description(generator.makeDescription())
                .build();
    }
}
