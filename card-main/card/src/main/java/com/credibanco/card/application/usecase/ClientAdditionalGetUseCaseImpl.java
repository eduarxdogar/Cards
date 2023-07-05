package com.credibanco.card.application.usecase;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;
import com.credibanco.card.domain.ports.in.ICreateAdditionalClientUseCase;
import com.credibanco.card.domain.ports.out.IExternalServicePort;

import java.util.Optional;

public class ClientAdditionalGetUseCaseImpl implements ICreateAdditionalClientUseCase {

     private final IExternalServicePort iExternalRepositoryPort;

    public ClientAdditionalGetUseCaseImpl(IExternalServicePort iExternalRepositoryPort) {
        this.iExternalRepositoryPort = iExternalRepositoryPort;
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
