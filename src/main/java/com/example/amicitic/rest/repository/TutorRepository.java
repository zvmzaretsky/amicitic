package com.example.amicitic.rest.repository;

import com.example.amicitic.database.TutorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorRepository extends MongoRepository<TutorModel, String> {

    boolean existsByEmailOrPhone(String email, String phone);
}
