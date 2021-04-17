package com.example.amicitic.rest.repository.account;

import com.example.amicitic.database.student.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountStudentRepository extends MongoRepository<StudentModel, String> {

    boolean existsByEmailOrPhone(String email, String phone);
}
