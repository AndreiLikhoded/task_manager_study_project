package com.task_manager_sudy_project.task_manager_study_project.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Day {
    private Integer dayOfMonth;
    private List<TaskItem> tasks;


}
