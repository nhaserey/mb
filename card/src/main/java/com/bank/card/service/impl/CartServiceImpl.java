package com.bank.card.service.impl;

import com.bank.card.model.Card;
import com.bank.card.repository.CardRepository;
import com.bank.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public Card save(Card loan) {
        return cardRepository.save(loan);
    }

    @Override
    public List<Card> getList() {
        return cardRepository.findAll();
    }

    @Override
    public List<Card> getByCustomerId(Long customerId) {
        return cardRepository.findByCustomerId(customerId);
    }
}
