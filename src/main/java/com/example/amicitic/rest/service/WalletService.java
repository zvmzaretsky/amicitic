package com.example.amicitic.rest.service;

public interface WalletService {
    double get(long id);

    void send(long id, long receiverId, double coins);
}
