package com.example.amicitic.rest.service.account;

import com.example.amicitic.database.SchoolModel;
import com.example.amicitic.database.StudentModel;
import com.example.amicitic.database.TutorModel;
import com.example.amicitic.rest.dto.account.CreateSchoolDTO;
import com.example.amicitic.rest.dto.account.CreateStudentDTO;
import com.example.amicitic.rest.dto.account.CreateTutorDTO;
import com.example.amicitic.rest.repository.SchoolRepository;
import com.example.amicitic.rest.repository.StudentRepository;
import com.example.amicitic.rest.repository.TutorRepository;
import com.example.amicitic.util.exceptions.AlreadyExistsException;
import org.springframework.stereotype.Service;

@Service
public record AccountServiceImpl(
        SchoolRepository schoolRepository,
        TutorRepository tutorRepository,
        StudentRepository studentRepository
) implements AccountService {

    @Override
    public void createSchool(CreateSchoolDTO dto) {

        if (schoolRepository.existsByName(dto.name()))
            throw new AlreadyExistsException();

        schoolRepository.save(new SchoolModel(dto.name()));
    }

    @Override
    public void createTutor(CreateTutorDTO dto) {

        if (tutorRepository.existsByEmailOrPhone(dto.email(), dto.phone()))
            throw new AlreadyExistsException();

        tutorRepository.save(new TutorModel(
                dto.firstName(),
                dto.lastName(),
                dto.dateOfBirth()
        ));
    }

    @Override
    public void createStudent(CreateStudentDTO dto) {

        if (studentRepository.existsByEmailOrPhone(dto.email(), dto.phone()))
            throw new AlreadyExistsException();

        studentRepository.save(new StudentModel(
                dto.firstName(),
                dto.lastName(),
                dto.dateOfBirth()
        ));
    }
}
