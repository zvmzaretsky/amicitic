package com.example.amicitic.rest.controller.account;

import com.example.amicitic.rest.dto.account.CreateSchoolDTO;
import com.example.amicitic.rest.dto.account.CreateStudentDTO;
import com.example.amicitic.rest.dto.account.CreateTutorDTO;
import org.springframework.http.ResponseEntity;

public interface AccountController {
    ResponseEntity<Object> createSchool(CreateSchoolDTO dto);

    ResponseEntity<Object> createTutor(CreateTutorDTO dto);

    ResponseEntity<Object> createStudent(CreateStudentDTO dto);
}
