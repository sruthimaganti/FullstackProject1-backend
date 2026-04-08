package com.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gallery.model.Orders;

public interface OrderRepository extends JpaRepository<Orders,Long>{

}