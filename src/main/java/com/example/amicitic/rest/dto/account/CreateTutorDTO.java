package com.example.amicitic.rest.dto.account;

public record CreateTutorDTO(
        String firstName,
        String lastName,
        long dateOfBirth
) {
}
