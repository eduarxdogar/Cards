package com.credibanco.card.domain.ports.in;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.models.Client;

public interface ICreateCardUseCase {
   public Card createCard(Card card);


   Client createClient(Long id);
}




