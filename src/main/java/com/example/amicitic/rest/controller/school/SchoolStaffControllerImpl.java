package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.AddStaffDTO;
import com.example.amicitic.rest.service.school.SchoolStaffServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school/{id}/staff")
public record SchoolStaffControllerImpl(SchoolStaffServiceImpl service) implements SchoolStaffController {

    @Override
    @PostMapping
    public ResponseEntity<Object> add(@PathVariable long id, @RequestBody AddStaffDTO dto) {
        try {
            service.add(id, dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @DeleteMapping("/{staff_id}")
    public ResponseEntity<Object> remove(@PathVariable long id, @PathVariable("staff_id") long staffId) {
        try {
            service.remove(id, staffId);
            return ResponseEntity.status(HttpStatus.CREATED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/{staff_id}")
    public ResponseEntity<Object> get(@PathVariable long id, @PathVariable("staff_id") long staffId) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id, staffId));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<Object> getList(@PathVariable long id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getList(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
