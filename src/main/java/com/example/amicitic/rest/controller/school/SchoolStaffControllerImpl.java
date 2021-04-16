package com.example.amicitic.rest.controller.school;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school/staff")
public record SchoolStaffControllerImpl() implements SchoolStaffController {

    @Override
    @PostMapping
    public void add() {

    }

    @Override
    @DeleteMapping("/{staff_id}")
    public void remove(@PathVariable("staff_id") long staffId) {

    }

    @Override
    @GetMapping("/{staff_id}")
    public void get(@PathVariable("staff_id") long staffId) {

    }

    @Override
    @GetMapping("/{school_id}")
    public void getList(@PathVariable("school_id") long staffId) {

    }
}
