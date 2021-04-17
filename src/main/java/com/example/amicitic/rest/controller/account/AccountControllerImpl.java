package com.example.amicitic.rest.controller.account;

import com.example.amicitic.rest.dto.account.CreateSchoolDTO;
import com.example.amicitic.rest.dto.account.CreateStudentDTO;
import com.example.amicitic.rest.dto.account.CreateTutorDTO;
import com.example.amicitic.rest.service.account.AccountServiceImpl;
import com.example.amicitic.util.exceptions.AlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public record AccountControllerImpl(AccountServiceImpl service) implements AccountController {

    @Override
    @PostMapping("/school")
    public ResponseEntity<Object> createSchool(@RequestBody CreateSchoolDTO dto) {
        try {
            service.createSchool(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (AlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    @PostMapping("/tutor")
    public ResponseEntity<Object> createTutor(@RequestBody CreateTutorDTO dto) {
        try {
            service.createTutor(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (AlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    @PostMapping("/student")
    public ResponseEntity<Object> createStudent(@RequestBody CreateStudentDTO dto) {
        try {
            service.createStudent(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (AlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
