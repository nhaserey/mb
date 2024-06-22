package com.bank.card.controller;

import com.bank.card.dto.CardDto;
import com.bank.card.mapper.CardMapper;
import com.bank.card.model.Card;
import com.bank.card.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/card")
public class CartController {
    @Autowired
    private CardService cardService;
    @Autowired
    private CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<?> create(
            @RequestBody CardDto dto
    ){
        Card card = cardService.save(cardMapper.toCard(dto));
        return ResponseEntity.ok(card);
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(cardService.getList());
    }

    @GetMapping("{customerId}")
    public ResponseEntity<List<Card>> getByCustomerId(
            @RequestHeader("bank-correlation-id") String correlationId,
            @PathVariable Long customerId
    ){
        log.debug("fetchLoanDetail method start");
        List<Card> loans = cardService.getByCustomerId(customerId);
        log.debug("fetchLoanDetail method end");
        return ResponseEntity.ok(loans);
    }
}
