package com.example.amicitic.rest.controller;

import org.springframework.http.ResponseEntity;

public interface WalletController {
    ResponseEntity<Object> get(long id);

    ResponseEntity<Object> send(long id, long receiverId, double coins);
}
