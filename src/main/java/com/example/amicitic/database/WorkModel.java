package com.example.amicitic.database;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "work")
public class WorkModel {

    @Id
    private String id;

    @Field
    private String data;

    @Field
    private String studentId;

    @Field
    private String schoolId;

    @Field
    private String subject;

    @Field
    private int grade;

    public WorkModel(String id, String data, String studentId, String schoolId, String subject, int grade) {
        this.id = id;
        this.data = data;
        this.studentId = studentId;
        this.schoolId = schoolId;
        this.subject = subject;
        this.grade = grade;
    }

    public WorkModel(String studentId, String schoolId, String subject, int grade) {
        this.studentId = studentId;
        this.schoolId = schoolId;
        this.subject = subject;
        this.grade = grade;
    }

    public WorkModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String homework) {
        this.data = homework;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
