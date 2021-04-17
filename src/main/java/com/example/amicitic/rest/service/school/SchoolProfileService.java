package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;

public interface SchoolProfileService {
    SchoolProfileDTO get(long schoolId);

    void set(long schoolId, SchoolProfileDTO dto);
}
