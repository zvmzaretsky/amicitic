package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.student.HomeworkDTO;
import org.springframework.http.ResponseEntity;

public interface StudentHomeworkController {

    ResponseEntity<Object> getList(String id);

    ResponseEntity<Object> send(String id, String to, HomeworkDTO dto);
}
