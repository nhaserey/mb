package com.bank.card.repository;

import com.bank.card.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends MongoRepository<Card,Long> {
    List<Card> findByCustomerId(Long customerId);
}
