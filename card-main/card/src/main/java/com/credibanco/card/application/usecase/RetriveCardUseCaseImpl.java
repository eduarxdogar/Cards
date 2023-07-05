package com.credibanco.card.application.usecase;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.ports.in.IRetriveCardUseCase;
import com.credibanco.card.domain.ports.out.ICardRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetriveCardUseCaseImpl implements IRetriveCardUseCase {

    private final ICardRepositoryPort iCardRepositoryPort;

    public RetriveCardUseCaseImpl(ICardRepositoryPort iCardRepositoryPort) {
        this.iCardRepositoryPort = iCardRepositoryPort;
    }


    @Override
    public Optional<Card> getCard(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Card> getAllCard() {
        return null;
    }
}
