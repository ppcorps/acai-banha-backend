package com.banhaacai.banhaacai.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "tb_Client" )
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String telephone;

    @OneToMany(mappedBy = "client" )
    private List<Order> orders = new ArrayList<Order>();

    public Client() {
    }

    public Client(Long id, String name, String telephone) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
