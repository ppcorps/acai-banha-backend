package com.banhaacai.banhaacai.dto;

import com.banhaacai.banhaacai.entities.Client;

public class ClientDTO {
    private Long id;
    private String name;
    private String telephone;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String telephone) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        telephone = entity.getTelephone();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }
}
