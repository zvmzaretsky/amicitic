package com.example.amicitic.rest.repository.account;

import com.example.amicitic.database.tutor.TutorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTutorRepository extends MongoRepository<TutorModel, String> {

    boolean existsByEmailOrPhone(String email, String phone);
}
