package com.lidiane.desafioLp2.model.services;
import com.lidiane.desafioLp2.model.entities.Client;
import com.lidiane.desafioLp2.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client create(Client client) {
       return repository.save(client);
    }

    public Client update(String id, Client client) {
        var clientDataBase =  repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não existe!"));

        clientDataBase.setName(client.getName());
        return repository.save(clientDataBase);
    }

    public Page<Client> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Client getById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Client doesn't exists!"));
    }
}
