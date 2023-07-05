package com.credibanco.card.domain.ports.in;

import com.credibanco.card.domain.models.Card;

import java.util.List;
import java.util.Optional;

public interface IRetriveCardUseCase {

    public Optional<Card> getCard(Long id);
    List<Card> getAllCard();
}
