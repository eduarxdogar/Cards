package com.credibanco.card.domain.ports.out;

import com.credibanco.card.domain.models.Client;

public interface IExternalServicePort {

    Client getAdditionalClient(Long CardId);

    public Client save(Client additionalCliente);
}
