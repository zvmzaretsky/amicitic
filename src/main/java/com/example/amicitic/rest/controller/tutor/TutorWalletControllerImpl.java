package com.example.amicitic.rest.controller.tutor;

import com.example.amicitic.rest.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/tutor/{id}/wallet")
public record TutorWalletControllerImpl() implements TutorWalletController {

    @Override
    @GetMapping()
    public ResponseEntity<Object> get(@PathVariable String id) {
        return null;
    }

    @Override
    @PostMapping()
    public ResponseEntity<Object> send(
            @PathVariable String id,
            String receiverId,
            @RequestBody TransactionDTO dto
    ) {
        return null;
    }
}
