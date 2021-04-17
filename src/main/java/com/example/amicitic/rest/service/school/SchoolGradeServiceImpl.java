package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record SchoolGradeServiceImpl() implements SchoolGradeService {

    @Override
    public void set(String issuerId, String studentId, int grade) {

    }

    @Override
    public void change(String issuerId, String studentId, String gradeId, int grade) {

    }

    @Override
    public void remove(String issuerId, String studentId, String gradeId) {

    }

    @Override
    public List<GradeDTO> getList(String studentId) {
        return null;
    }

    @Override
    public GradeDTO get(String studentId, String gradeId) {
        return null;
    }
}
