package com.example.amicitic.rest.service;

public interface WalletService {
    double get(String id);

    void send(String id, String receiverId, double coins);
}
