package com.example.amicitic.database;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blockchain")
public class BlockModel {

    private String data;
    private String previousHash;
    private long timeStamp;
    private String hash;

    public BlockModel(String data, String previousHash, long timeStamp, String hash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.hash = hash;
    }

    public BlockModel() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
