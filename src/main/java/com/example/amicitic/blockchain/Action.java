package com.example.amicitic.blockchain;

public class Action {

    public static record Registration(
            String id
    ) {
    }

    public static record Transaction(
            String from,
            String to,
            double coins
    ) {
    }

    public static record Grade(
            String from,
            String student,
            int grade
    ) {
    }

    public static record Homework(
            String student,
            String to,
            String data
    ) {
    }
}
