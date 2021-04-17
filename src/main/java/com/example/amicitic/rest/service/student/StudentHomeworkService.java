package com.example.amicitic.rest.service.student;

import com.example.amicitic.rest.dto.student.HomeworkDTO;

import java.util.List;

public interface StudentHomeworkService {

    List<HomeworkDTO> getList(String id);

    void send(String id, String to, HomeworkDTO dto);
}
