package com.credibanco.card.domain.ports.out;

import com.credibanco.card.domain.models.Card;

import java.util.List;
import java.util.Optional;

public interface ICardRepositoryPort {
  public   Card save(Card card);

    Optional<Card> findById(Long id);

    List<Card> findAll();

  Optional<Card> updateCard(Card card);
}
