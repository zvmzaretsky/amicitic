package com.example.amicitic.rest.controller;

import com.example.amicitic.rest.controller.student.StudentGradeController;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.http.ResponseEntity;

public interface GradeController extends StudentGradeController {
    ResponseEntity<Object> set(String id, int grade);

    ResponseEntity<Object> change(String id, int grade);

    ResponseEntity<Object> remove(String id);
}
