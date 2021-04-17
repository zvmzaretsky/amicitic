package com.example.amicitic.rest.controller;

import com.example.amicitic.rest.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;

public interface WalletController {
    ResponseEntity<Object> get(String id);

    ResponseEntity<Object> send(String id, String receiverId, TransactionDTO dto);
}
