package com.banhaacai.banhaacai.services;

import com.banhaacai.banhaacai.dto.ClientDTO;
import com.banhaacai.banhaacai.entities.Client;
import com.banhaacai.banhaacai.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService {


    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true )
    public ClientDTO findById(long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true )
    public List<ClientDTO> findAll() {
        List<Client> result = repository.findAll();
        return result.stream().map(x -> new ClientDTO()).toList();
    }
}
