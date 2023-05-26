package com.task_manager_sudy_project.task_manager_study_project.controller;

import com.task_manager_sudy_project.task_manager_study_project.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {
    private final CalendarService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("calendar", service.getCalendar());
        return "index";
    }
}
