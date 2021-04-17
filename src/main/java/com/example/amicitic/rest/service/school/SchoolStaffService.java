package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.AddStaffDTO;
import com.example.amicitic.rest.dto.school.GetStaffDTO;

import java.util.List;

public interface SchoolStaffService {
    void add(long id, AddStaffDTO dto);

    void remove(long id, long staffId);

    GetStaffDTO get(long id, long staffId);

    List<GetStaffDTO> getList(long id);
}
