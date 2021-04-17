package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.AddStaffDTO;
import org.springframework.http.ResponseEntity;

public interface SchoolStaffController {
    ResponseEntity<Object> add(long id, AddStaffDTO dto);

    ResponseEntity<Object> remove(long id, long staffId);

    ResponseEntity<Object> get(long id, long staffId);

    ResponseEntity<Object> getList(long id);
}
