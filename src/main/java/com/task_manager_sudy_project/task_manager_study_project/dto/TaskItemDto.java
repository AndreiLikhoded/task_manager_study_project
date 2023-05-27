package com.task_manager_sudy_project.task_manager_study_project.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskItemDto {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
