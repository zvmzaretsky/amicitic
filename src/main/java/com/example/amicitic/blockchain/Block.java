package com.example.amicitic.blockchain;

import com.example.amicitic.database.BlockModel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Block<T> {

    private final T data;
    private final String previousHash;
    private final long timeStamp;
    private final String hash;

    public Block(T data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = Instant.now().getEpochSecond();
        this.hash = calculateHash();
    }

    public String calculateHash() {

        String dataToHash = previousHash
                + timeStamp
                + data;

        MessageDigest digest;
        byte[] bytes = null;

        try {
            digest = MessageDigest.getInstance("SHA-256");
            bytes = digest.digest(dataToHash.getBytes(UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        StringBuilder builder = new StringBuilder();

        if (bytes != null)
            for (byte b : bytes) {
                builder.append(String.format("%02x", b));
            }

        return builder.toString();
    }

    public BlockModel toBlockModel() {
        return new BlockModel(
                data.toString(),
                previousHash,
                timeStamp,
                hash
        );
    }
}
