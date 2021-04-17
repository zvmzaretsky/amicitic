package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.GetStaffDTO;

import java.util.List;

public interface SchoolStaffService {
    void add(String id, String staffId);

    void remove(String id, String staffId);

    GetStaffDTO get(String id, String staffId);

    List<GetStaffDTO> getList(String id);
}
