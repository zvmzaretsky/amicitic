package com.example.amicitic.rest.controller.school;

import org.springframework.http.ResponseEntity;

public interface SchoolStaffController {
    ResponseEntity<Object> add(String id, String staffId);

    ResponseEntity<Object> remove(String id, String staffId);

    ResponseEntity<Object> get(String id, String staffId);

    ResponseEntity<Object> getList(String id);
}
