package com.credibanco.card.infraestructure.configuration;

import com.credibanco.card.application.service.CardService;
import com.credibanco.card.application.usecase.*;
import com.credibanco.card.domain.ports.in.ICreateAdditionalClientUseCase;
import com.credibanco.card.domain.ports.out.ICardRepositoryPort;
import com.credibanco.card.domain.ports.out.IExternalServicePort;
import com.credibanco.card.infraestructure.Adaptadores.ExternalServiceAdapter;
import com.credibanco.card.infraestructure.repositorio.JpaCardRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

@Bean
    public CardService cardService(ICardRepositoryPort iCardRepositoryPort,ICreateAdditionalClientUseCase iCreateAdditionalClientUseCase){
     return  new CardService(
             new CreateCardUseCaseImpl(iCardRepositoryPort),
             new RetriveCardUseCaseImpl(iCardRepositoryPort),
             new UpdateCardUseCaseImpl(iCardRepositoryPort),
             new DeleteCardUseCaseImpl(iCardRepositoryPort),
             iCreateAdditionalClientUseCase


             );
}
@Bean
    public ICardRepositoryPort iCardRepositoryPort (JpaCardRepositoryAdapter jpaCardRepositoryAdapter){

    return  jpaCardRepositoryAdapter;
}
@Bean
    public ICreateAdditionalClientUseCase getAdditionalClientUseCase(IExternalServicePort externalServicePort){

return  new ClientAdditionalGetUseCaseImpl(externalServicePort);
}
@Bean
public  IExternalServicePort iExternalServicePort(){
    return  new ExternalServiceAdapter();
}
}
