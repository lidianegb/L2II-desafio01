package com.lidiane.desafioLp2.controller.request;

import com.lidiane.desafioLp2.model.entities.Client;
import lombok.Setter;

@Setter
public class ClientRequest {

    private String name;
    private String email;

    public Client toClient() {
        var client = new Client();

        client.setName(name);
        client.setEmail(email);

        return client;
    }
}
