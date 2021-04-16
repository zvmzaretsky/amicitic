package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.student.StudentProfileDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/{id}/profile")
public record StudentProfileControllerImpl() implements StudentProfileController {

    @Override
    @GetMapping
    public StudentProfileDTO get(@PathVariable long id) {
        return null;
    }

    @Override
    @PostMapping
    public void set(@PathVariable long id, @RequestBody StudentProfileDTO dto) {

    }
}
