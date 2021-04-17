package com.example.amicitic.rest.controller.student;

import org.springframework.http.ResponseEntity;

public interface StudentProfileController {
    ResponseEntity<Object> get(String studentId);
}
