package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.student.StudentProfileDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/{id}/profile")
public record StudentProfileControllerImpl() implements StudentProfileController {

    @Override
    @GetMapping
    public StudentProfileDTO get(@PathVariable String id) {
        return null;
    }


}
