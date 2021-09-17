package com.lidiane.desafioLp2.model.repository;

import com.lidiane.desafioLp2.model.entities.Client;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}