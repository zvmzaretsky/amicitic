package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.SetGradeDTO;
import com.example.amicitic.rest.service.school.SchoolGradeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school/{id}/grade")
public record SchoolGradeControllerImpl(SchoolGradeServiceImpl service) implements SchoolGradeController {

    @Override
    @PostMapping("/{student_id}")
    public ResponseEntity<Object> set(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @RequestBody SetGradeDTO grade
    ) {
        try {
            service.set(id, studentId, grade);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @PatchMapping("/{student_id}")
    public ResponseEntity<Object> change(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @RequestBody long gradeId,
            SetGradeDTO grade
    ) {
        try {
            service.change(id, studentId, gradeId, grade);
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @DeleteMapping("/{student_id}/{grade_id}")
    public ResponseEntity<Object> remove(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @PathVariable("grade_id") long gradeId
    ) {
        try {
            service.remove(id, studentId, gradeId);
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/{student_id}/list")
    public ResponseEntity<Object> getList(@PathVariable("student_id") long studentId) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(studentId));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/{student_id}/{grade_id}")
    public ResponseEntity<Object> get(
            @PathVariable("student_id") long studentId,
            @PathVariable("grade_id") long gradeId
    ) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(studentId, gradeId));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
