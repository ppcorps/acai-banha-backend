package com.banhaacai.banhaacai.controllers;

import com.banhaacai.banhaacai.dto.ClientDTO;
import com.banhaacai.banhaacai.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
   public ClientDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
