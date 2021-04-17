package com.example.amicitic.rest.dto.account;

public record CreateTutorDTO(
        String firstName,
        String lastName,
        String email,
        String phone,
        long dateOfBirth
) {
}
