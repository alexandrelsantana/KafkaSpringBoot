package com.kafkaService.repositories;

import com.kafkaService.models.PersonModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<PersonModel, String> {

    @Query("{name:'?0'}")
    PersonModel findByName(String name);

}
