package com.task_manager_sudy_project.task_manager_study_project.dao;

import com.task_manager_sudy_project.task_manager_study_project.Util.Generator;
import com.task_manager_sudy_project.task_manager_study_project.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public User makeUser(){
        Generator generator = Generator.getInstance();
        return User.builder()
                .name(generator.makeName())
                .email(generator.makeEmail())
                .password(generator.makePassword())
                .build();
    }

}
