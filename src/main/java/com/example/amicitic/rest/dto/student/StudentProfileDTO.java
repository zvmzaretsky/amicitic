package com.example.amicitic.rest.dto.student;

public record StudentProfileDTO(
        String firstName,
        String lastName,
        String email,
        String phone,
        int age
) {
}
