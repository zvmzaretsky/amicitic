package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.student.StudentProfileDTO;

public interface StudentProfileController {
    StudentProfileDTO get(long studentId);

    void set(long studentId, StudentProfileDTO dto);
}
