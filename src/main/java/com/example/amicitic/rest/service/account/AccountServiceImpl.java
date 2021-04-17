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
import com.example.amicitic.util.helper.BlockWriterHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    private final SchoolRepository schoolRepository;
    private final TutorRepository tutorRepository;
    private final StudentRepository studentRepository;
    private final BlockWriterHelper blockWriterHelper;

    @Autowired
    public AccountServiceImpl(SchoolRepository schoolRepository, TutorRepository tutorRepository, StudentRepository studentRepository, BlockWriterHelper blockWriterHelper) {
        this.schoolRepository = schoolRepository;
        this.tutorRepository = tutorRepository;
        this.studentRepository = studentRepository;
        this.blockWriterHelper = blockWriterHelper;
    }

    @Override
    @Transactional
    public void createSchool(CreateSchoolDTO dto) {

        if (schoolRepository.existsByName(dto.name()))
            throw new AlreadyExistsException();

        SchoolModel model = new SchoolModel(dto.name());

        schoolRepository.save(model);

        blockWriterHelper.userRegistered(model.getId());
    }

    @Override
    @Transactional
    public void createTutor(CreateTutorDTO dto) {

        if (tutorRepository.existsByEmailOrPhone(dto.email(), dto.phone()))
            throw new AlreadyExistsException();

        TutorModel model = new TutorModel(
                dto.firstName(),
                dto.lastName(),
                dto.email(),
                dto.phone(),
                dto.dateOfBirth()
        );

        tutorRepository.save(model);

        blockWriterHelper.userRegistered(model.getId());
    }

    @Override
    @Transactional
    public void createStudent(CreateStudentDTO dto) {

        if (studentRepository.existsByEmailOrPhone(dto.email(), dto.phone()))
            throw new AlreadyExistsException();

        StudentModel model = new StudentModel(
                dto.firstName(),
                dto.lastName(),
                dto.email(),
                dto.phone(),
                dto.dateOfBirth()
        );

        studentRepository.save(model);

        blockWriterHelper.userRegistered(model.getId());
    }
}
