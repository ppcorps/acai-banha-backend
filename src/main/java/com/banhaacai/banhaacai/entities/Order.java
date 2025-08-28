package com.banhaacai.banhaacai.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;

@Entity
@Table(name= "tb_order" )
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP HITHOUT TIME ZONE")
    private Instant instant;
    private Double valorTotal;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
