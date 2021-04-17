package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.AddSubjectDTO;
import org.springframework.http.ResponseEntity;

public interface SchoolSubjectController {
    ResponseEntity<Object> add(String id, AddSubjectDTO dto);

    ResponseEntity<Object> remove(String id, String subjectId);

    ResponseEntity<Object> get(String id, String subjectId);

    ResponseEntity<Object> getList(String id);
}
