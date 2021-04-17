package com.example.amicitic.rest.service.tutor;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record TutorGradeServiceImpl(
        TutorGradeTransactions transactions
) implements TutorGradeService {

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
