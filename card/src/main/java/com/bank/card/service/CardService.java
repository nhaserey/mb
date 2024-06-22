package com.bank.card.service;

import com.bank.card.model.Card;

import java.util.List;

public interface CardService {
    Card save(Card loan);

    List<Card> getList();

    List<Card> getByCustomerId(Long customerId);
}
