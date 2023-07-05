package com.credibanco.card.application.service;


import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;
import com.credibanco.card.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class CardService implements ICreateCardUseCase, IUpdateCardUseCase, IDeleteCardUseCase, IRetriveCardUseCase, ICreateAdditionalClientUseCase {

    private final ICreateCardUseCase iCreateCardUseCase;
    private final IRetriveCardUseCase iRetriveCardUseCase;

    private final ICreateAdditionalClientUseCase iCreateAdditionalClientUseCase;

    private final IDeleteCardUseCase iDeleteCardUseCase;

    private final  IUpdateCardUseCase iUpdateCardUseCase;


    public CardService(ICreateCardUseCase iCreateCardUseCase, IRetriveCardUseCase iRetriveCardUseCase, ICreateAdditionalClientUseCase iCreateAdditionalClientUseCase, IDeleteCardUseCase iDeleteCardUseCase, IUpdateCardUseCase iUpdateCardUseCase) {
        this.iCreateCardUseCase = iCreateCardUseCase;
        this.iRetriveCardUseCase = iRetriveCardUseCase;
        this.iCreateAdditionalClientUseCase = iCreateAdditionalClientUseCase;
        this.iDeleteCardUseCase = iDeleteCardUseCase;
        this.iUpdateCardUseCase = iUpdateCardUseCase;
    }


    @Override
    public Card createCard(Card card) {
        return iCreateCardUseCase.createCard(card);
    }

    @Override
    public boolean deleteCard(Long id) {
        return false;
    }

    @Override
    public Client getClient(Long id) {
        return iCreateAdditionalClientUseCase.getClient(id);
    }
    @Override
    public Client createClient(Long id) {
        return null;
    }

    @Override
    public Optional<Card> getCard(Long id) {
        return iRetriveCardUseCase.getCard(id);
    }

    @Override
    public List<Card> getAllCard() {
        return null;
    }

    @Override
    public Optional<Card> updateCard(Long id, Card updateCard) {
        return Optional.empty();
    }
}
