package com.example.amicitic.rest.service;

import com.example.amicitic.rest.dto.TransactionDTO;

public interface WalletService {
    double get(String id);

    void send(String id, String receiverId, TransactionDTO dto);
}
