package com.example.amicitic.rest.service.school;

import com.example.amicitic.rest.dto.TransactionDTO;
import org.springframework.stereotype.Service;

@Service
public record SchoolWalletServiceImpl() implements SchoolWalletService {

    @Override
    public double get(String id) {
        return 0;
    }

    @Override
    public void send(String id, String receiverId, TransactionDTO dto) {

    }
}
