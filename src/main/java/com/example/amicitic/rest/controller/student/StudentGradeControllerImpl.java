package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.GradeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/{id}/grade")
public record StudentGradeControllerImpl() implements StudentGradeController {

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable String id) {
        return null;
    }

    @Override
    @GetMapping("/{grade_id}")
    public ResponseEntity<Object> get(@PathVariable String id, @PathVariable("grade_id") String gradeId) {
        return null;
    }
}
