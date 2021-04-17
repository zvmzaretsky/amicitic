package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;
import org.springframework.http.ResponseEntity;

public interface SchoolProfileController {
    ResponseEntity<Object> get(long schoolId);

    ResponseEntity<Object> set(long schoolId, SchoolProfileDTO dto);
}
