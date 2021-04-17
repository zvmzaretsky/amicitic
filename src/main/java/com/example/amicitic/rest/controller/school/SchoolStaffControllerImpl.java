package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.AddStaffDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school/{id}/staff")
public record SchoolStaffControllerImpl() implements SchoolStaffController {

    @Override
    @PostMapping
    public void add(@PathVariable long id, @RequestBody AddStaffDTO dto) {

    }

    @Override
    @DeleteMapping("/{staff_id}")
    public void remove(@PathVariable long id, @PathVariable("staff_id") long staffId) {

    }

    @Override
    @GetMapping("/{staff_id}")
    public void get(@PathVariable long id, @PathVariable("staff_id") long staffId) {

    }

    @Override
    @GetMapping
    public void getList(@PathVariable long id) {

    }
}
