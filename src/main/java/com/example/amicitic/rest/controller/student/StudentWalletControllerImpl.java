package com.example.amicitic.rest.controller.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/{id}/wallet")
public record StudentWalletControllerImpl() implements StudentWalletController {

    @Override
    @GetMapping
    public ResponseEntity<Object> get(@PathVariable String id) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<Object> send(@PathVariable String id, String receiverId, @RequestBody double coins) {
        return null;
    }
}
