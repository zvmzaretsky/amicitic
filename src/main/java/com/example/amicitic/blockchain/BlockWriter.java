package com.example.amicitic.blockchain;

import com.example.amicitic.database.blockchain.BlockModel;
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

    public BlockModel<Action.Registration> userRegistered(String id) {

        BlockModel<Action.Registration> model = new Block<>(
                new Action.Registration(id),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }

    public BlockModel<Action.Transaction> transactionMade(String from, String to, double coins) {

        BlockModel<Action.Transaction> model = new Block<>(
                new Action.Transaction(from, to, coins),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }

    public BlockModel<Action.Homework> homeworkSent(String student, String to, Object homework) {

        String data = Base64.getEncoder().encodeToString(SerializationUtils.serialize(homework));

        BlockModel<Action.Homework> model = new Block<>(
                new Action.Homework(student, to, data),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }

    public BlockModel<Action.Grade> gradeSet(String from, String student, int grade) {

        BlockModel<Action.Grade> model = new Block<>(
                new Action.Grade(from, student, grade),
                lastHash
        ).toBlockModel();

        lastHash = model.getHash();

        return model;
    }
}
