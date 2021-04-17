package com.example.amicitic.rest.repository.school.staff;

import com.example.amicitic.database.TutorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolStaffTutorRepository extends MongoRepository<TutorModel, String> {
}
