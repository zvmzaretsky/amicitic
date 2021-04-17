package com.example.amicitic.blockchain;

import com.example.amicitic.database.BlockModel;
import org.springframework.util.SerializationUtils;

import java.util.Base64;

public class BlockWriter {

    private static volatile BlockWriter instance;

    private String lastHash;

    public static BlockWriter getInstance() {
        BlockWriter localInstance = instance;

        if (localInstance == null) {

            synchronized (BlockWriter.class) {
                localInstance = instance;

                if (localInstance == null) {
                    instance = localInstance = new BlockWriter();
                }
            }
        }

        return localInstance;
    }

    public BlockModel userRegistered(String id) {

        BlockModel model = new Block<>(
                new Action.Registration(id),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }

    public BlockModel transactionMade(String from, String to, double coins) {

        BlockModel model = new Block<>(
                new Action.Transaction(from, to, coins),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }

    public BlockModel homeworkSent(String student, String to, Object homework) {

        String data = Base64.getEncoder().encodeToString(SerializationUtils.serialize(homework));

        BlockModel model = new Block<>(
                new Action.Homework(student, to, data),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }

    public BlockModel gradeSet(String from, String student, int grade) {

        BlockModel model = new Block<>(
                new Action.Grade(from, student, grade),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }
}
