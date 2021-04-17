package com.example.amicitic.database.student;

import com.example.amicitic.database.HomeworkModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "students")
public class StudentModel {

    @Id
    private String id;

    @Field
    private String firstName;

    @Field
    private String lastName;

    @Field
    private String email;

    @Field
    private String phone;

    @Field
    private long dateOfBirth;

    @Field
    private double amicoins;

    private List<HomeworkModel> homework;

    public StudentModel(String id, String firstName, String lastName, String email, String phone, long dateOfBirth, double amicoins, List<HomeworkModel> homework) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.amicoins = amicoins;
        this.homework = homework;
    }

    public StudentModel(String firstName, String lastName, long dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.amicoins = 0;
        homework = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public List<HomeworkModel> getHomework() {
        return homework;
    }

    public void setHomework(List<HomeworkModel> homework) {
        this.homework = homework;
    }
}
