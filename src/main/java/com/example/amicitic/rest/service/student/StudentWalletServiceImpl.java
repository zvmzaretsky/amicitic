package com.example.amicitic.rest.service.student;

import com.example.amicitic.database.SchoolModel;
import com.example.amicitic.database.StudentModel;
import com.example.amicitic.database.TutorModel;
import com.example.amicitic.rest.dto.TransactionDTO;
import com.example.amicitic.rest.repository.SchoolRepository;
import com.example.amicitic.rest.repository.StudentRepository;
import com.example.amicitic.rest.repository.TutorRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public record StudentWalletServiceImpl(
        StudentRepository studentRepository,
        TutorRepository tutorRepository,
        SchoolRepository schoolRepository
) implements StudentWalletService {

    @Override
    public double get(String id) {
        return studentRepository.findById(id).orElseThrow().getAmicoins();
    }

    @Override
    public void send(String id, String receiverId, TransactionDTO dto) {

        if (dto.coins() <= 0 || dto.coins()  > get(id))
            throw new IllegalArgumentException();

        switch (UserType.getById(dto.receiver())) {
            case STUDENT -> {
                StudentModel model = studentRepository.findById(receiverId).orElseThrow();
                model.setAmicoins(model.getAmicoins() + dto.coins());
                studentRepository.save(model);
            }
            case TUTOR -> {
                TutorModel model = tutorRepository.findById(receiverId).orElseThrow();
                model.setAmicoins(model.getAmicoins() + dto.coins());
                tutorRepository.save(model);
            }
            case SCHOOL -> {
                SchoolModel model = schoolRepository.findById(receiverId).orElseThrow();
                model.setAmicoins(model.getAmicoins() + dto.coins());
                schoolRepository.save(model);
            }
        }
    }

    enum UserType {
        STUDENT(0),
        TUTOR(1),
        SCHOOL(2);

        private static final Map<Integer, UserType> byId = new HashMap<>();

        static {
            for (UserType u : values())
                byId.put(u.id, u);
        }

        int id;

        UserType(int id) {
            this.id = id;
        }

        static UserType getById(int id) {
            return byId.get(id);
        }
    }
}
