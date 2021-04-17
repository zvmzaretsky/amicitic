package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.AddSubjectDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public record SchoolSubjectControllerImpl() implements SchoolSubjectController {

    @Override
    public ResponseEntity<Object> add(String id, AddSubjectDTO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Object> remove(String id, String subjectId) {
        return null;
    }

    @Override
    public ResponseEntity<Object> get(String id, String subjectId) {
        return null;
    }

    @Override
    public ResponseEntity<Object> getList(String id) {
        return null;
    }
}
