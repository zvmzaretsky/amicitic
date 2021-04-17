package com.example.amicitic.util.helper;

import com.example.amicitic.blockchain.BlockWriter;
import com.example.amicitic.rest.repository.BlockchainRepository;
import org.springframework.stereotype.Component;

@Component
public record BlockWriterHelper(
        BlockchainRepository repository
) {

    public void userRegistered(String id) {
        repository.save(BlockWriter.getInstance().userRegistered(id));
    }

    public void transactionMade(String from, String to, double coins) {
        repository.save(BlockWriter.getInstance().transactionMade(from, to, coins));
    }

    public void homeworkSent(String from, String to, Object data) {
        repository.save(BlockWriter.getInstance().homeworkSent(from, to, data));
    }

    public void gradeSet(String from, String to, int grade) {
        repository.save(BlockWriter.getInstance().homeworkSent(from, to, grade));
    }
}
