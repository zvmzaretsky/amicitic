package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.school.GetStaffDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record SchoolStaffServiceImpl() implements SchoolStaffService {

    @Override
    public void add(String id, String staffId) {

    }

    @Override
    public void remove(String id, String staffId) {

    }

    @Override
    public GetStaffDTO get(String id, String staffId) {
        return null;
    }

    @Override
    public List<GetStaffDTO> getList(String id) {
        return null;
    }
}
