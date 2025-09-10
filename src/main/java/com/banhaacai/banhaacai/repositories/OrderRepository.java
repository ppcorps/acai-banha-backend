package com.banhaacai.banhaacai.repositories;

import com.banhaacai.banhaacai.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
