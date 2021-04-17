package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school/{id}/grade")
public record SchoolGradeControllerImpl() implements SchoolGradeController {

    @Override
    @PostMapping("")
    public void set(@PathVariable long id, long studentId, SetGradeDTO grade) {

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
