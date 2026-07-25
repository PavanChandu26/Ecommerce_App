package com.telusko.springecom.repo;

import com.telusko.springecom.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByProduct_Id(int productId);
}
