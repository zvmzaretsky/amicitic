package com.example.amicitic.rest.service.account;

import com.example.amicitic.rest.dto.account.CreateSchoolDTO;
import com.example.amicitic.rest.dto.account.CreateStudentDTO;
import com.example.amicitic.rest.dto.account.CreateTutorDTO;

public interface AccountService {
    void createSchool(CreateSchoolDTO dto);

    void createTutor(CreateTutorDTO dto);

    void createStudent(CreateStudentDTO dto);
}
