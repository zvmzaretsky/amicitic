package com.example.amicitic.rest.controller.account;

import com.example.amicitic.rest.dto.account.CreateSchoolDTO;
import com.example.amicitic.rest.dto.account.CreateStudentDTO;
import com.example.amicitic.rest.dto.account.CreateTutorDTO;
import com.example.amicitic.rest.service.account.AccountServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public record AccountControllerImpl(AccountServiceImpl service) implements AccountController {

    @Override
    public ResponseEntity<Object> createSchool(CreateSchoolDTO dto) {
        try {
            service.createSchool(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<Object> createTutor(CreateTutorDTO dto) {
        try {
            service.createTutor(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<Object> createStudent(CreateStudentDTO dto) {
        try {
            service.createStudent(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
