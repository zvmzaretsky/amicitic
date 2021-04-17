package com.example.amicitic.rest.controller.tutor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutor/{id}/wallet")
public record TutorWalletControllerImpl() implements TutorWalletController {

    @Override
    @GetMapping()
    public ResponseEntity<Object> get(@PathVariable long id) {
        return null;
    }

    @Override
    @PostMapping()
    public ResponseEntity<Object> send(@PathVariable long id, long receiverId, @RequestBody double coins) {
        return null;
    }
}
