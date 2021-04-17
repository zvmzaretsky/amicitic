package com.example.amicitic.rest.controller.school;

import com.example.amicitic.rest.controller.school.SchoolWalletController;
import com.example.amicitic.rest.dto.TransactionDTO;
import com.example.amicitic.rest.service.school.SchoolWalletServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/school/{id}/wallet")
public record SchoolWalletControllerImpl(SchoolWalletServiceImpl service) implements SchoolWalletController {

    @Override
    public ResponseEntity<Object> get(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.get(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<Object> send(
            @PathVariable String id,
            @RequestParam String receiverId,
            @RequestBody TransactionDTO dto
            ) {
        try {
            service.send(id, receiverId, dto);
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
