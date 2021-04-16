package com.example.amicitic.rest.controller;

public interface WalletController {
    double get(long id);
    double send(long id, double coins);
}
