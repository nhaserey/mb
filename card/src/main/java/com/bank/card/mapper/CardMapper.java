package com.bank.card.mapper;

import com.bank.card.dto.CardDto;
import com.bank.card.model.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toCard(CardDto dto);
}
