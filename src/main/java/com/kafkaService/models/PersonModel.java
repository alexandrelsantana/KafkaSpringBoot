package com.kafkaService.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Getter
@Document(collection= "persons")
public class PersonModel {

    @Id
    private String _id;
    private String name;

    public PersonModel (String _id, String name){
        super();
        this._id = _id;
        this.name = name;
    }
}
