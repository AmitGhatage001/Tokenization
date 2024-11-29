package com.tokenization.tokenization.repository;

import com.tokenization.tokenization.model.Flatdetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlatdetailsRepository extends MongoRepository<Flatdetails,String> {

}
