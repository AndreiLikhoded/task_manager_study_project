package com.task_manager_sudy_project.task_manager_study_project.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String email;
    private String password;
}
