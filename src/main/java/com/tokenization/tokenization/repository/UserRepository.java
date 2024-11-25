package com.tokenization.tokenization.repository;

import com.tokenization.tokenization.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User findByEmail(String email);
}
