package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.dto.school.AddStaffDTO;

public interface SchoolStaffController {
    void add(long id, AddStaffDTO dto);
    void remove(long id, long staffId);
    void get(long id, long staffId);
    void getList(long id);
}
