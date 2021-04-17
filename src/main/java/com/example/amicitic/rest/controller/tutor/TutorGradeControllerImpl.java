package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.service.tutor.TutorGradeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/tutor/grade/{id}")
public record TutorGradeControllerImpl(TutorGradeServiceImpl service) implements TutorGradeController {

    @Override
    @PostMapping
    public ResponseEntity<Object> set(
            @PathVariable String id,
            @RequestBody int grade
    ) {
        return null;
    }

    @Override
    @PatchMapping
    public ResponseEntity<Object> change(
            @PathVariable String id,
            @RequestBody int grade
    ) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<Object> remove(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable String id) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<Object> get(
            @PathVariable String id
    ) {
        return null;
    }
}
