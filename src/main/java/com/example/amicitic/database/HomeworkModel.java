package com.example.amicitic.database;

public class HomeworkModel {

    private String id;
    private String homework;
    private String studentId;
    private String schoolId;
    private String subjectId;

    public HomeworkModel(String id, String homework, String studentId, String schoolId, String subjectId) {
        this.id = id;
        this.homework = homework;
        this.studentId = studentId;
        this.schoolId = schoolId;
        this.subjectId = subjectId;
    }

    public HomeworkModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
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

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
}
