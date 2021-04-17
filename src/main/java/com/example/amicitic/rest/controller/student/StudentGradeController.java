package com.example.amicitic.rest.controller.student;

import org.springframework.http.ResponseEntity;

public interface StudentGradeController {
    ResponseEntity<Object> getList(long studentId);

    ResponseEntity<Object> get(long studentId, long gradeId);
}
