package com.example.amicitic.rest.dto.account;

public record CreateStudentDTO(
        String firstName,
        String lastName,
        String email,
        String phone,
        long dateOfBirth
) {
}
