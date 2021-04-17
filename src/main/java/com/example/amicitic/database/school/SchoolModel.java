package com.example.amicitic.database.school;

import com.example.amicitic.database.student.StudentModel;
import com.example.amicitic.database.tutor.TutorModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "schools")
public class SchoolModel {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String country;

    @Field
    private String city;

    @Field
    private double amicoins;

    @DBRef
    private List<TutorModel> tutors;

    @DBRef
    private List<StudentModel> students;

    public SchoolModel(String id, String name, String country, String city, List<TutorModel> tutors, List<StudentModel> students, double amicoins) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.tutors = tutors;
        this.students = students;
        this.amicoins = amicoins;
    }

    public SchoolModel(String name) {
        System.out.println("nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee: " + name);
        this.name = name;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
        this.amicoins = 0;
    }

    public SchoolModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<TutorModel> getTutors() {
        return tutors;
    }

    public void setTutors(List<TutorModel> tutors) {
        this.tutors = tutors;
    }

    public List<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }

    public double getAmicoins() {
        return amicoins;
    }

    public void setAmicoins(double amicoins) {
        this.amicoins = amicoins;
    }
}
