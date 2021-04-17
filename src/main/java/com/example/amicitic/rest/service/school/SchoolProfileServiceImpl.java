package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.SchoolProfileDTO;
import org.springframework.stereotype.Service;


@Service
public record SchoolProfileServiceImpl(

) implements SchoolProfileService {

    @Override
    public SchoolProfileDTO get(String schoolId) {
        return null;
    }

    @Override
    public void set(String schoolId, SchoolProfileDTO dto) {

    }
}
