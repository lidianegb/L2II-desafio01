package com.lidiane.desafioLp2.model.entities;
import com.lidiane.desafioLp2.model.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientMock {

    public static List<Client> populateClients(ClientRepository service) {
        List<Client> clientsMock =  new ArrayList<Client>();

        Client c1 = new Client();
        c1.setName("José Valdir");
        c1.setEmail("josevaldir@gmail.com");
        clientsMock.add(c1);
        service.save(c1);

        Client c2 = new Client();
        c1.setName("Maria Auxiliadora");
        c1.setEmail("mariaauxiliadora@gmail.com");
        clientsMock.add(c2);
        service.save(c2);

        Client c3 = new Client();
        c1.setName("Luis Rafael");
        c1.setEmail("luisrafael@gmail.com");
        clientsMock.add(c3);
        service.save(c3);

        Client c4 = new Client();
        c1.setName("Lidiane Gomes");
        c1.setEmail("lidianegb@gmail.com");
        clientsMock.add(c4);
        service.save(c4);

        Client c5 = new Client();
        c1.setName("Valdenia Gomes");
        c1.setEmail("valdenia@gmail.com");
        clientsMock.add(c5);
        service.save(c5);

        Client c6 = new Client();
        c1.setName("Valdilene Sampaio");
        c1.setEmail("valsampaio@gmail.com");
        clientsMock.add(c6);
        service.save(c6);

        Client c7 = new Client();
        c1.setName("Assis Gomes");
        c1.setEmail("assisgomes@gmail.com");
        clientsMock.add(c7);
        service.save(c7);

        Client c8 = new Client();
        c1.setName("Larissa Sampaio");
        c1.setEmail("larissasampaio@gmail.com");
        clientsMock.add(c8);
        service.save(c8);

        Client c9 = new Client();
        c1.setName("José Valdeci");
        c1.setEmail("josevaldeci@gmail.com");
        clientsMock.add(c9);
        service.save(c9);

        Client c10 = new Client();
        c1.setName("Rafael Gomes");
        c1.setEmail("rafagomes@gmail.com");
        clientsMock.add(c10);
        service.save(c10);

        return clientsMock;
    }
}
