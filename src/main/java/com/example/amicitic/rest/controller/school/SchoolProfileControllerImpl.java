package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school/{id}/profile")
public record SchoolProfileControllerImpl() implements SchoolProfileController {

    @Override
    public SchoolProfileDTO get(long schoolId) {
        return null;
    }

    @Override
    public void set(long schoolId, SchoolProfileDTO dto) {

    }
}
