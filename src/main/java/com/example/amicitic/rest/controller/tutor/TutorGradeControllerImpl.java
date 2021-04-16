package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutor/{id}/grade")
public record TutorGradeControllerImpl() implements TutorGradeController {


    @Override
    @PostMapping
    public void set(@PathVariable long id, long studentId, SetGradeDTO grade) {

    }

    @Override
    @PatchMapping
    public void change(@PathVariable long id, long studentId, SetGradeDTO grade) {

    }

    @Override
    @DeleteMapping
    public void remove(@PathVariable long id, long studentId) {

    }

    @Override
    @GetMapping("/list")
    public List<GradeDTO> getList(@PathVariable long id) {
        return null;
    }

    @Override
    @GetMapping
    public GradeDTO get(@PathVariable long id, long gradeId) {
        return null;
    }
}
