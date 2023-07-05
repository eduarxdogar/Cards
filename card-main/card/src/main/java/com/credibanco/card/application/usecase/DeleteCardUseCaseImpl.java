package com.credibanco.card.application.usecase;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;
import com.credibanco.card.domain.ports.in.ICreateAdditionalClientUseCase;
import com.credibanco.card.domain.ports.in.IDeleteCardUseCase;
import com.credibanco.card.domain.ports.out.ICardRepositoryPort;

import java.util.Optional;

public class DeleteCardUseCaseImpl implements IDeleteCardUseCase, ICreateAdditionalClientUseCase {
    private final ICardRepositoryPort iCardRepositoryPort;

    public DeleteCardUseCaseImpl(ICardRepositoryPort iCardRepositoryPort) {
        this.iCardRepositoryPort = iCardRepositoryPort;
    }


    @Override
    public Client getClient(Long id) {
        return null;
    }

    @Override
    public Optional<Card> updateCard(Long id, Card updateCard) {
        return Optional.empty();
    }

    @Override
    public boolean deleteCard(Long id) {
        return false;
    }
}
