package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;

public interface SchoolProfileService {
    SchoolProfileDTO get(String schoolId);

    void set(String schoolId, SchoolProfileDTO dto);
}
