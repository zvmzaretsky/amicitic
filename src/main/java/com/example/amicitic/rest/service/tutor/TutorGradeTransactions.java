package com.example.amicitic.rest.service.tutor;

import com.example.amicitic.database.StudentModel;
import com.example.amicitic.database.WorkModel;
import com.example.amicitic.rest.repository.HomeworkRepository;
import com.example.amicitic.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.data.util.ClassTypeInformation.COLLECTION;

@Transactional
@Service
public class TutorGradeTransactions {

    private final HomeworkRepository studentRepository;

    @Autowired
    public TutorGradeTransactions(HomeworkRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void setGrade(String id, int grade) {
        WorkModel model = studentRepository.findById(id).orElseThrow();
        model.setGrade(grade);
        studentRepository.insert(model);
    }
}
