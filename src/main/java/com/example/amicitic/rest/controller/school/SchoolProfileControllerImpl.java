package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;
import com.example.amicitic.rest.service.school.SchoolProfileServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/school/profile/{id}")
public record SchoolProfileControllerImpl(SchoolProfileServiceImpl service) implements SchoolProfileController {

    @Override
    @GetMapping
    public ResponseEntity<Object> get(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
