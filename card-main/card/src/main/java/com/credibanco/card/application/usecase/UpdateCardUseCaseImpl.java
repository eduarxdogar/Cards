package com.credibanco.card.application.usecase;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;
import com.credibanco.card.domain.ports.in.ICreateAdditionalClientUseCase;
import com.credibanco.card.domain.ports.in.IUpdateCardUseCase;
import com.credibanco.card.domain.ports.out.ICardRepositoryPort;

import java.util.Optional;

public class UpdateCardUseCaseImpl implements IUpdateCardUseCase, ICreateAdditionalClientUseCase {

    private  final ICardRepositoryPort iCardRepositoryPort;

    public UpdateCardUseCaseImpl(ICardRepositoryPort iCardRepositoryPort) {
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
}
