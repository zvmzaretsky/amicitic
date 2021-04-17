package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.dto.GradeDTO;
import com.example.amicitic.rest.dto.SetGradeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutor/{id}/grade")
public record TutorGradeControllerImpl() implements TutorGradeController {


    @Override
    @PostMapping("/{student_id}")
    public void set(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @RequestBody SetGradeDTO grade) {

    }

    @Override
    @PatchMapping("/{student_id}")
    public void change(
            @PathVariable long id,
            @PathVariable("student_id") long studentId,
            @RequestBody SetGradeDTO grade) {

    }

    @Override
    @DeleteMapping("/{student_id}")
    public void remove(@PathVariable long id, @PathVariable("student_id") long studentId) {

    }

    @Override
    @GetMapping("/list")
    public List<GradeDTO> getList(@PathVariable long id) {
        return null;
    }

    @Override
    @GetMapping("/{grade_id}")
    public GradeDTO get(@PathVariable long id, @PathVariable("grade_id") long gradeId) {
        return null;
    }
}
