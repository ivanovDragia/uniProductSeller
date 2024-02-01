package com.example.springbootproductseller.repository;

import com.example.springbootproductseller.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
