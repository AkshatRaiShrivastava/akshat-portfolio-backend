package com.akshat.akshatPortfolio.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akshat.akshatPortfolio.Models.messageModel;

public interface messageRepo extends MongoRepository<messageModel,String> {
    
}
