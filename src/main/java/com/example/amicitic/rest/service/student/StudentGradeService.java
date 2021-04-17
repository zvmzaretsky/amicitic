package com.example.amicitic.rest.service.student;

import com.example.amicitic.rest.dto.GradeDTO;

import java.util.List;

public interface StudentGradeService {
    List<GradeDTO> getList(long studentId);

    GradeDTO get(long studentId, long gradeId);
}
