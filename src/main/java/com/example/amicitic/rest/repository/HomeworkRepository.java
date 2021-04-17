package com.example.amicitic.rest.repository;

import com.example.amicitic.database.HomeworkModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HomeworkRepository extends MongoRepository<HomeworkModel, String> {
}
