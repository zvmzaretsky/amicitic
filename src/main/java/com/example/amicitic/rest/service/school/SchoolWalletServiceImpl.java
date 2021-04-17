package com.example.amicitic.rest.service.school;

import org.springframework.stereotype.Service;

@Service
public record SchoolWalletServiceImpl() implements SchoolWalletService {

    @Override
    public double get(long id) {
        return 0;
    }

    @Override
    public void send(long id, long receiverId, double coins) {

    }
}
