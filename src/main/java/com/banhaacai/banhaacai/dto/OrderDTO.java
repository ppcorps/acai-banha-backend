package com.banhaacai.banhaacai.dto;

import com.banhaacai.banhaacai.entities.Order;

import java.time.Instant;

public class OrderDTO {
    private Long id;
    private Instant orderDate;
    private Double orderAmount;

    public OrderDTO() {
    }

    public OrderDTO(Long id, Instant orderDate, Double orderAmount) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        orderDate = entity.getOrderDate();
        orderAmount = entity.getOrderAmount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
