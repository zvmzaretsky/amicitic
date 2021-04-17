package com.example.amicitic.rest.service;

import com.example.amicitic.rest.controller.student.StudentGradeController;
import com.example.amicitic.rest.dto.SetGradeDTO;
import com.example.amicitic.rest.service.student.StudentGradeService;

public interface GradeService extends StudentGradeService {
    void set(String issuerId, String studentId, int grade);

    void change(String issuerId, String studentId, String gradeId, int grade);

    void remove(String issuerId, String studentId, String gradeId);
}
