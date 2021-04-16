package com.example.amicitic.rest.controller;

import com.example.amicitic.rest.controller.student.StudentGradeController;
import com.example.amicitic.rest.dto.SetGradeDTO;

public interface GradeController extends StudentGradeController {
    void set(long issuerId, long studentId, SetGradeDTO grade);
    void change(long issuerId, long studentId, SetGradeDTO grade);
    void remove(long issuerId, long studentId);
}
