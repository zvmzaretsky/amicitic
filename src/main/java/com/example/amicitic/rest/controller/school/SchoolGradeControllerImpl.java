package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.service.school.SchoolGradeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/school/grade/{id}")
public record SchoolGradeControllerImpl(SchoolGradeServiceImpl service) implements SchoolGradeController {

    @Override
    @PostMapping
    public ResponseEntity<Object> set(
            @PathVariable String id,
            @RequestBody int grade
    ) {
        try {
            service.set(id, grade);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Object> change(String id, int grade) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<Object> remove(
            @PathVariable String id
    ) {
        try {
            service.remove(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<Object> get(
            @PathVariable String id
    ) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
