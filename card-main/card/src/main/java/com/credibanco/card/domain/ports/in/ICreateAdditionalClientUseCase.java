package com.credibanco.card.domain.ports.in;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;

import java.util.Optional;

public interface ICreateAdditionalClientUseCase extends IUpdateCardUseCase {
    public Client getClient(Long id);

    @Override
    Optional<Card> updateCard(Long id , Card updateCard);


}
