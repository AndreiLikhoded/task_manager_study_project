package com.task_manager_sudy_project.task_manager_study_project.dao;

import com.task_manager_sudy_project.task_manager_study_project.model.Day;
import com.task_manager_sudy_project.task_manager_study_project.model.TaskItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DayDao {
    public Day makeDay(List<TaskItem> tasks, int dayOfMonth){
        return Day.builder()
                .id(dayOfMonth)
                .dayOfMonth(dayOfMonth)
                .tasks(tasks)
                .build();
    }
}
