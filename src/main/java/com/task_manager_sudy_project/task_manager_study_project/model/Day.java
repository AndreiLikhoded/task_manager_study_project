package com.task_manager_sudy_project.task_manager_study_project.model;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Day {
    private Integer id;
    private Integer dayOfMonth;
    private List<TaskItem> tasks;


}
