package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record SchoolGradeServiceImpl() implements SchoolGradeService {

    @Override
    public void set(long issuerId, long studentId, SetGradeDTO grade) {

    }

    @Override
    public void change(long issuerId, long studentId, long gradeId, SetGradeDTO grade) {

    }

    @Override
    public void remove(long issuerId, long studentId, long gradeId) {

    }

    @Override
    public List<GradeDTO> getList(long studentId) {
        return null;
    }

    @Override
    public GradeDTO get(long studentId, long gradeId) {
        return null;
    }
}
