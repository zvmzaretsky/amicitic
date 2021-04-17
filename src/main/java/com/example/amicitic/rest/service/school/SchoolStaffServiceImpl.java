package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.AddStaffDTO;
import com.example.amicitic.rest.dto.school.GetStaffDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record SchoolStaffServiceImpl() implements SchoolStaffService {

    @Override
    public void add(long id, AddStaffDTO dto) {

    }

    @Override
    public void remove(long id, long staffId) {

    }

    @Override
    public GetStaffDTO get(long id, long staffId) {
        return null;
    }

    @Override
    public List<GetStaffDTO> getList(long id) {
        return null;
    }
}
