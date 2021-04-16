package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;

public interface SchoolProfileController {
    SchoolProfileDTO get(long schoolId);
    void set(long schoolId, SchoolProfileDTO dto);
}
