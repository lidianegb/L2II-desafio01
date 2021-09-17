package com.lidiane.desafioLp2.controller.response;

import com.lidiane.desafioLp2.model.entities.Client;
import lombok.Getter;

@Getter
public class ClientResponse {

    private String id;
    private String name;
    private String email;
    private Boolean enabled;

    public ClientResponse fromClient(Client client){
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();
        this.enabled = client.getEnabled();

        return this;
    }

}
