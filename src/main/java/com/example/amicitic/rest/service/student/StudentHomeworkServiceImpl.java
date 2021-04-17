package com.example.amicitic.rest.service.student;

import com.example.amicitic.database.WorkModel;
import com.example.amicitic.rest.dto.student.HomeworkDTO;
import com.example.amicitic.rest.repository.HomeworkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record StudentHomeworkServiceImpl(
        HomeworkRepository homeworkRepository
) implements StudentHomeworkService {

    @Override
    public List<HomeworkDTO> getList(String id) {
        return homeworkRepository.getAllByStudentId(id)
                .stream()
                .map(x -> new HomeworkDTO(
                        x.getGrade(),
                        (int) (Math.random() * 100),
                        x.getData()
                )).toList();
    }

    @Override
    public void send(String id, String to, HomeworkDTO dto) {
        WorkModel model = new WorkModel(
                to,
                id,
                null,
                dto.grade()
        );
        homeworkRepository.insert(model);
    }
}
