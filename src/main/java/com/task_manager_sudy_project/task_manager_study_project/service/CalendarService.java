package com.task_manager_sudy_project.task_manager_study_project.service;

import com.task_manager_sudy_project.task_manager_study_project.dto.DayDto;
import com.task_manager_sudy_project.task_manager_study_project.dto.TaskItemDto;
import com.task_manager_sudy_project.task_manager_study_project.model.Day;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CalendarService {
    private final DayService service;
    private final DayService dayService;
    private List<Day> days = new ArrayList<>();


    public DayDto getDayById(int dayId) {
        Day day = days.stream()
                .filter(e -> e.getId().equals(dayId))
                .findFirst()
                .orElseThrow();
        List<TaskItemDto> taskItemDto = day.getTasks().stream()
                .map(e -> TaskItemDto.builder()
                        .id(e.getId())
                        .name(e.getName())
                        .type(e.getType().getType().getValue())
                        .description(e.getDescription())
                        .build())
                .toList();

        return DayDto.builder()
                .id(day.getId())
                .tasks(taskItemDto)
                .build();
    }

}
