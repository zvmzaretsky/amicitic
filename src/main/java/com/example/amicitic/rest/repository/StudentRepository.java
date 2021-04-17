package com.example.amicitic.rest.repository;

import com.example.amicitic.database.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepository extends MongoRepository<StudentModel, String> {

    boolean existsByEmailOrPhone(String email, String phone);

}
