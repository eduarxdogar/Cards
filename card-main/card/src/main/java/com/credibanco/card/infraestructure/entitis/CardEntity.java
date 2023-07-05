package com.credibanco.card.infraestructure.entitis;

import com.credibanco.card.domain.models.Card;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pan;

    private String name;

    private  String password;

    private LocalDateTime dateexpirationdate;

    public CardEntity() {
    }

    public CardEntity(Long pan, String name , String password, LocalDateTime dateexpirationdate){

        this.pan=pan;
        this.name=name;
        this.password=password;
        this.dateexpirationdate=dateexpirationdate;

    }
    public static  CardEntity fromDomainModel(Card card){
        return  new CardEntity(card.getPan(),card.getName(),card.getPassword(),card.getDateexpirationdate());
    }

    public Card toDomainModel(){
        return  new Card(pan,name,password,dateexpirationdate);
    }

    public Long getPan() {
        return pan;
    }

    public void setPan(Long pan) {
        this.pan = pan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateexpirationdate() {
        return dateexpirationdate;
    }

    public void setDateexpirationdate(LocalDateTime dateexpirationdate) {
        this.dateexpirationdate = dateexpirationdate;
    }
}
