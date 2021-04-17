package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.dto.SetGradeDTO;
import com.example.amicitic.rest.service.tutor.TutorGradeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutor/{id}/grade")
public record TutorGradeControllerImpl(TutorGradeServiceImpl service) implements TutorGradeController {

    @Override
    @PostMapping("/{student_id}")
    public ResponseEntity<Object> set(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @RequestBody SetGradeDTO grade) {
        return null;
    }

    @Override
    @PatchMapping("/{student_id}")
    public ResponseEntity<Object> change(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @RequestBody long gradeId, SetGradeDTO grade) {
        return null;
    }

    @Override
    @DeleteMapping("/{student_id}/{grade_id}")
    public ResponseEntity<Object> remove(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @PathVariable("grade_id") long gradeId
    ) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(studentId));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable long id) {
        return null;
    }

    @Override
    @GetMapping("/{grade_id}")
    public ResponseEntity<Object> get(@PathVariable long id, @PathVariable("grade_id") long gradeId) {
        return null;
    }
}
