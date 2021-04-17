package com.example.amicitic.rest.repository;

import com.example.amicitic.database.WorkModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeworkRepository extends MongoRepository<WorkModel, String> {

    List<WorkModel> getAllByStudentId(String id);
}
