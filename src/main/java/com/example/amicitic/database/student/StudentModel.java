package com.example.amicitic.database.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class StudentModel {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private long dateOfBirth;

    private double amicoins;

    public StudentModel(String id, String firstName, String lastName, long dateOfBirth, double amicoins) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.amicoins = amicoins;
    }

    public StudentModel(String firstName, String lastName, long dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.amicoins = 0;
    }

    public StudentModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getAmicoins() {
        return amicoins;
    }

    public void setAmicoins(double amicoins) {
        this.amicoins = amicoins;
    }
}
