package com.task_manager_sudy_project.task_manager_study_project.service;

import com.task_manager_sudy_project.task_manager_study_project.dao.DayDao;
import com.task_manager_sudy_project.task_manager_study_project.dao.TaskItemDao;
import com.task_manager_sudy_project.task_manager_study_project.dto.DayDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DayService {
    private final TaskItemDao taskItemDao;
    private final DayDao dayDao;

    public List<DayDto> getAllDays() {
        var days = dayDao.getAllDays();
        return days.stream()
                .map(e -> DayDto.builder()
                        .id(e.getId())
                        .dayOfMonth(e.getDayOfMonth())
                        .build())
                .toList();
    }

}
