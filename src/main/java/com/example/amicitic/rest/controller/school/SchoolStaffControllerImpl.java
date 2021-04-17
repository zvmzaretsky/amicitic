package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.service.school.SchoolStaffServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/school/staff/{id}")
public record SchoolStaffControllerImpl(SchoolStaffServiceImpl service) implements SchoolStaffController {

    @Override
    @PostMapping
    public ResponseEntity<Object> add(
            @PathVariable String id,
            @RequestBody String staffId
    ) {
        try {
            service.add(id, staffId);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @DeleteMapping("/{staff_id}")
    public ResponseEntity<Object> remove(
            @PathVariable String id,
            @PathVariable("staff_id") String staffId
    ) {
        try {
            service.remove(id, staffId);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/{staff_id}")
    public ResponseEntity<Object> get(
            @PathVariable String id,
            @PathVariable("staff_id") String staffId
    ) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id, staffId));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
