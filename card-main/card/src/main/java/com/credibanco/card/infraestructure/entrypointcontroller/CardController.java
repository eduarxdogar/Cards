package com.credibanco.card.infraestructure.entrypointcontroller;

import com.credibanco.card.application.service.CardService;
import com.credibanco.card.domain.models.Card;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/cards")
public class CardController {

    private  final  CardService CardService;

    public CardController(CardService CardService) {
        this.CardService = CardService;
    }

   @PostMapping
    public ResponseEntity<Card>createCard(@RequestBody Card card){
        Card createCard = CardService.createCard(card);
        return  new ResponseEntity<>(createCard,HttpStatus.CREATED);



   }
}
