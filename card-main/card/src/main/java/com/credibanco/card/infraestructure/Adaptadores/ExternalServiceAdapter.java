package com.credibanco.card.infraestructure.Adaptadores;

import com.credibanco.card.domain.models.Client;
import com.credibanco.card.domain.ports.out.IExternalServicePort;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



public class ExternalServiceAdapter implements IExternalServicePort {

    private final RestTemplate restTemplate;

    public ExternalServiceAdapter() {
        restTemplate = new RestTemplate();
    }

    @Override
    public Client getAdditionalClient(Long CardId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + CardId;
        ResponseEntity<JsonPlaceHolderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceHolderTodo.class);
        JsonPlaceHolderTodo todo = response.getBody();
        if (todo == null) {
            return null;
        }

        apiUrl = "https://jsonplaceholder.typicode.com/todos/" + todo.getId();
        ResponseEntity<JsonPlaceHolderUser>userResponse=restTemplate.getForEntity(apiUrl,JsonPlaceHolderUser.class);
        JsonPlaceHolderUser user = userResponse.getBody();
        if (user == null){
            return null;

        }
        return  new Client(Math.toIntExact(user.getId()), user.getName(), user.getApellido());
    }

    @Getter
    @Setter
    private static class JsonPlaceHolderTodo {

        private Long pan;
        private Long Id;


    }
    @Getter
    @Setter
    private  static  class  JsonPlaceHolderUser{
        private  Long id;

        private  String name;

        private String apellido;



    }


    @Override
    public Client save(Client additionalCliente) {
        return null;
    }
}

