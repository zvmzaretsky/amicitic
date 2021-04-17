package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.service.student.StudentProfileServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student/{id}/profile")
public record StudentProfileControllerImpl(
        StudentProfileServiceImpl service
) implements StudentProfileController {

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
