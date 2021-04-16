package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school/grade")
public record SchoolGradeControllerImpl() implements SchoolGradeController {

    @Override
    public void set(long issuerId, long studentId, SetGradeDTO grade) {

    }

    @Override
    public void change(long issuerId, long studentId, SetGradeDTO grade) {

    }

    @Override
    public void remove(long issuerId, long studentId) {

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
