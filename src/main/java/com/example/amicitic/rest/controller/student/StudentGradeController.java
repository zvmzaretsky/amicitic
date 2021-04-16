package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.GradeDTO;

import java.util.List;

public interface StudentGradeController {
    List<GradeDTO> getList(long studentId);
    GradeDTO get(long studentId, long gradeId);
}
