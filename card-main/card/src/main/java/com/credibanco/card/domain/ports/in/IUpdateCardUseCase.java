package com.credibanco.card.domain.ports.in;

import com.credibanco.card.domain.models.Card;

import java.util.Optional;

public interface IUpdateCardUseCase {
    public Optional <Card> updateCard(Long id , Card updateCard);

}
