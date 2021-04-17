package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.student.HomeworkDTO;
import com.example.amicitic.rest.service.student.StudentHomeworkServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student/homework/{id}")
public record StudentHomeworkControllerImpl(
        StudentHomeworkServiceImpl service
) implements StudentHomeworkController {

    @Override
    @GetMapping
    public ResponseEntity<Object> getList(@PathVariable String id) {
        return ResponseEntity.status(200).body(service.getList(id));
    }

    @Override
    @PostMapping("/{id1}")
    public ResponseEntity<Object> send(@PathVariable String id, @PathVariable("id1") String to, @RequestBody HomeworkDTO dto) {
        service.send(id, to, dto);
        return ResponseEntity.ok().build();
    }
}
