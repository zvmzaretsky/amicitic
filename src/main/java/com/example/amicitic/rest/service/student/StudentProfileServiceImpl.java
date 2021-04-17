package com.example.amicitic.rest.service.student;

import com.example.amicitic.database.StudentModel;
import com.example.amicitic.rest.dto.student.StudentProfileDTO;
import com.example.amicitic.rest.repository.StudentRepository;
import com.example.amicitic.util.helper.AgeHelper;
import org.springframework.stereotype.Service;

@Service
public record StudentProfileServiceImpl(
        StudentRepository studentRepository,
        AgeHelper ageHelper
) implements StudentProfileService {

    @Override
    public StudentProfileDTO get(String id) {
        StudentModel model = studentRepository.findById(id).orElseThrow();

        return new StudentProfileDTO(
                model.getFirstName(),
                model.getLastName(),
                model.getEmail(),
                model.getPhone(),
                ageHelper.getAge(model.getDateOfBirth())
        );
    }

    @Override
    public void set(String id, StudentProfileDTO dto) {

    }
}
