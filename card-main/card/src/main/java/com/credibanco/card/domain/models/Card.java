package com.credibanco.card.domain.models;

import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Card {

     private Long pan;

     private String name;

     private  String password;

     private LocalDateTime dateexpirationdate;


    }

