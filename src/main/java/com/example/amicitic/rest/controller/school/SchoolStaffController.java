package com.example.amicitic.rest.controller.school;

public interface SchoolStaffController {
    void add();
    void remove(long staffId);
    void get(long staffId);
    void getList(long schoolId);
}
