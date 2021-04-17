package com.example.amicitic.rest.repository.account;

import com.example.amicitic.database.school.SchoolModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountSchoolRepository extends MongoRepository<SchoolModel, String> {
}
