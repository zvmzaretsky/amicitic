package com.example.amicitic.rest.repository;

import com.example.amicitic.database.BlockModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlockchainRepository extends MongoRepository<BlockModel, String> {
}
