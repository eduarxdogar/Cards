package com.credibanco.card.infraestructure.repositorio;

import com.credibanco.card.infraestructure.entitis.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJpaCardRepository extends JpaRepository<CardEntity,Long> {
}
