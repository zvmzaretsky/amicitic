package com.example.amicitic.rest.repository.school.staff;

import com.example.amicitic.database.school.SchoolModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolStaffSchoolRepository extends MongoRepository<SchoolModel, String> {
}
