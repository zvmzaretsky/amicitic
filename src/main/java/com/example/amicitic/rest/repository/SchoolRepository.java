package com.example.amicitic.rest.repository;

import com.example.amicitic.database.SchoolModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<SchoolModel, String> {

    boolean existsByName(String name);
}
