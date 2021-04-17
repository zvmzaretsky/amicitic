package com.example.amicitic.rest.controller.student;

import org.springframework.http.ResponseEntity;

public interface StudentGradeController {
    ResponseEntity<Object> getList(String studentId);

    ResponseEntity<Object> get(String id);
}
