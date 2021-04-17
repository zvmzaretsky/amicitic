package com.example.amicitic.rest.controller.student;

import com.example.amicitic.rest.dto.TransactionDTO;
import com.example.amicitic.rest.service.student.StudentWalletServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student/wallet/{id}")
public record StudentWalletControllerImpl(
        StudentWalletServiceImpl service
) implements StudentWalletController {

    @Override
    @GetMapping
    public ResponseEntity<Object> get(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    @PostMapping("/{receiver_id}")
    public ResponseEntity<Object> send(
            @PathVariable String id,
            @PathVariable("receiver_id") String receiverId,
            @RequestBody TransactionDTO dto
            ) {
        try {
            service.send(id, receiverId, dto);
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
