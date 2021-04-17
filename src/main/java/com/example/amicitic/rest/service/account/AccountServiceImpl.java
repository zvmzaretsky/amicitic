package com.example.amicitic.rest.service.account;

import com.example.amicitic.database.school.SchoolModel;
import com.example.amicitic.database.student.StudentModel;
import com.example.amicitic.database.tutor.TutorModel;
import com.example.amicitic.rest.dto.account.CreateSchoolDTO;
import com.example.amicitic.rest.dto.account.CreateStudentDTO;
import com.example.amicitic.rest.dto.account.CreateTutorDTO;
import com.example.amicitic.rest.repository.account.AccountSchoolRepository;
import com.example.amicitic.rest.repository.account.AccountStudentRepository;
import com.example.amicitic.rest.repository.account.AccountTutorRepository;
import org.springframework.stereotype.Service;

@Service
public record AccountServiceImpl(
        AccountSchoolRepository schoolRepository,
        AccountTutorRepository tutorRepository,
        AccountStudentRepository studentRepository
) implements AccountService {

    @Override
    public void createSchool(CreateSchoolDTO dto) {
        schoolRepository.save(new SchoolModel(dto.name()));
    }

    @Override
    public void createTutor(CreateTutorDTO dto) {
        tutorRepository.save(new TutorModel(
                dto.firstName(),
                dto.lastName(),
                dto.dateOfBirth()
        ));
    }

    @Override
    public void createStudent(CreateStudentDTO dto) {
        studentRepository.save(new StudentModel(
                dto.firstName(),
                dto.lastName(),
                dto.dateOfBirth()
        ));
    }
}
