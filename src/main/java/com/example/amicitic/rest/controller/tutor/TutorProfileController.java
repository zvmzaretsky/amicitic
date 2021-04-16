package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.dto.tutor.TutorProfileDTO;

public interface TutorProfileController {
    TutorProfileDTO get(long id);
    void set(long id, TutorProfileDTO dto);
}
