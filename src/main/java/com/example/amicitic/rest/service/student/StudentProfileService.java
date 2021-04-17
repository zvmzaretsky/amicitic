package com.example.amicitic.rest.service.student;

import com.example.amicitic.rest.dto.student.StudentProfileDTO;

public interface StudentProfileService {
    StudentProfileDTO get(String id);

    void set(String id, StudentProfileDTO dto);
}
