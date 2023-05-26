package com.task_manager_sudy_project.task_manager_study_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalendarService {
    private final DayService service;

}
