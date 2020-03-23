package com.springbootmongodbdemo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootmongodbdemo.models.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

}
