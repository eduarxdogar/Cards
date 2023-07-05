package com.credibanco.card.application.usecase;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;
import com.credibanco.card.domain.ports.in.ICreateCardUseCase;
import com.credibanco.card.domain.ports.out.ICardRepositoryPort;

public class CreateCardUseCaseImpl implements ICreateCardUseCase {

    private final ICardRepositoryPort iCardRepositoryPort;

    public CreateCardUseCaseImpl(ICardRepositoryPort iCardRepositoryPort) {
        this.iCardRepositoryPort = iCardRepositoryPort;
    }


    @Override
    public Card createCard(Card card) {
        return null;
    }

    @Override
    public Client createClient(Long id) {
        return null;
    }
}

