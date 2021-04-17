package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.service.student.StudentGradeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student/grade/{id}")
public record StudentGradeControllerImpl(
        StudentGradeServiceImpl service
) implements StudentGradeController {

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<Object> get(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
