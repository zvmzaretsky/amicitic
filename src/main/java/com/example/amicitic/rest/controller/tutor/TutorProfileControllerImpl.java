package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.dto.tutor.TutorProfileDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/tutor/{id}/profile")
public record TutorProfileControllerImpl() implements TutorProfileController {

    @Override
    @GetMapping
    public TutorProfileDTO get(@PathVariable long id) {
        return null;
    }

    @Override
    @PostMapping
    public void set(@PathVariable long id, TutorProfileDTO dto) {

    }
}
