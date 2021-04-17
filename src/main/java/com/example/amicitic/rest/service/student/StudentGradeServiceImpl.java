package com.example.amicitic.rest.service.student;

import com.example.amicitic.rest.dto.GradeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record StudentGradeServiceImpl() implements StudentGradeService {

    @Override
    public List<GradeDTO> getList(long studentId) {
        return null;
    }

    @Override
    public GradeDTO get(long studentId, long gradeId) {
        return null;
    }
}
