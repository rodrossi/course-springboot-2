package com.cubo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cubo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
