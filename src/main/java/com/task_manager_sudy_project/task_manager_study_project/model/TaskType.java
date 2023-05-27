package com.task_manager_sudy_project.task_manager_study_project.model;
import com.task_manager_sudy_project.task_manager_study_project.enums.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskType {
    private Integer id;
    private Type type;

}
