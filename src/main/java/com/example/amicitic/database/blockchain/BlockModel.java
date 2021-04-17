package com.example.amicitic.database.blockchain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blockchain")
public class BlockModel<T> {

    private T data;
    private String previousHash;
    private long timeStamp;
    private String hash;

    public BlockModel(T data, String previousHash, long timeStamp, String hash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.hash = hash;
    }

    public BlockModel() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
