package com.example.amicitic.rest.controller;

import com.example.amicitic.rest.controller.student.StudentGradeController;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.http.ResponseEntity;

public interface GradeController extends StudentGradeController {
    ResponseEntity<Object> set(long id, long studentId, SetGradeDTO grade);

    ResponseEntity<Object> change(long id, long studentId, long gradeId, SetGradeDTO grade);

    ResponseEntity<Object> remove(long id, long studentId, long gradeId);
}
