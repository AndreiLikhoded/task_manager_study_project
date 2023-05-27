package com.task_manager_sudy_project.task_manager_study_project.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class DayDto {
    private Integer id;
    private Integer dayOfMonth;
    private List<TaskItemDto> tasks;
}
