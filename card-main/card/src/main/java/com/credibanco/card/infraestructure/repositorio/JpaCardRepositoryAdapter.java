package com.credibanco.card.infraestructure.repositorio;

import com.credibanco.card.domain.models.Card;
import com.credibanco.card.domain.ports.out.ICardRepositoryPort;
import com.credibanco.card.infraestructure.entitis.CardEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCardRepositoryAdapter implements ICardRepositoryPort {

  private final  IJpaCardRepository iJpaCardRepository;

    public JpaCardRepositoryAdapter(IJpaCardRepository iJpaCardRepository) {
        this.iJpaCardRepository = iJpaCardRepository;
    }


    @Override
    public Card save(Card card) {
        CardEntity cardEntity = CardEntity.fromDomainModel(card);
        CardEntity saveCardEntity = iJpaCardRepository.save(cardEntity);
        return saveCardEntity.toDomainModel();
    }
    @Override
    public Optional<Card> findById(Long id){
        return  iJpaCardRepository.findById(id).map(CardEntity::toDomainModel);
    }

    @Override
    public  List<Card> findAll(){
        return  iJpaCardRepository.findAll().stream().map(CardEntity::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public  Optional<Card> updateCard(Card card){
        if (iJpaCardRepository.existsById(card.getPan())){
            CardEntity cardEntity = CardEntity.fromDomainModel(card);
            CardEntity updateCardEntity = iJpaCardRepository.save(cardEntity);
            return Optional.of(updateCardEntity.toDomainModel());

        }
        return Optional.empty();
    }





}
