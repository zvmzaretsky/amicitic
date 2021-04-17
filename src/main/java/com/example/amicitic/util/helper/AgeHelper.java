package com.example.amicitic.util.helper;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

@Component
public record AgeHelper() {

    public int getAge(long dateOfBirth) {
        return (int) ChronoUnit.YEARS.between(
                Instant.ofEpochSecond(dateOfBirth).atZone(ZoneOffset.UTC),
                Instant.now().atZone(ZoneOffset.UTC)
        );
    }
}
