package com.example.amicitic.rest.service;

import com.example.amicitic.rest.controller.student.StudentGradeController;
import com.example.amicitic.rest.dto.SetGradeDTO;
import com.example.amicitic.rest.service.student.StudentGradeService;

public interface GradeService extends StudentGradeService {
    void set(long issuerId, long studentId, SetGradeDTO grade);

    void change(long issuerId, long studentId, long gradeId, SetGradeDTO grade);

    void remove(long issuerId, long studentId, long gradeId);
}
