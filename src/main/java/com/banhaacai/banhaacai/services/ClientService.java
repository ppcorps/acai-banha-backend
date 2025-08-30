package com.banhaacai.banhaacai.services;

import com.banhaacai.banhaacai.dto.ClientDTO;
import com.banhaacai.banhaacai.entities.Client;
import com.banhaacai.banhaacai.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClientService {


    @Autowired
    private ClientRepository repository;

    public ClientDTO findById(long id) {
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto =  new ClientDTO(client);
        return dto;
    }

}
