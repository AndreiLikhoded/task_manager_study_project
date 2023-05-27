package com.task_manager_sudy_project.task_manager_study_project.controller;

import ch.qos.logback.core.model.Model;
import com.task_manager_sudy_project.task_manager_study_project.dto.DayDto;
import com.task_manager_sudy_project.task_manager_study_project.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequiredArgsConstructor
public class DayController {
    private final CalendarService service;

    @GetMapping("/day/{dayId}")
    public String getDay(@PathVariable int dayId, Model model) {
        DayDto dayDto = service.getDayById(dayId);
        model.addAtribute("day", dayDto);
        return "day";
    }
}
