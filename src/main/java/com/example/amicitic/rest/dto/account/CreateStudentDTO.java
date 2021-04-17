package com.example.amicitic.rest.dto.account;

public record CreateStudentDTO(
        String firstName,
        String lastName,
        long dateOfBirth
) {
}
