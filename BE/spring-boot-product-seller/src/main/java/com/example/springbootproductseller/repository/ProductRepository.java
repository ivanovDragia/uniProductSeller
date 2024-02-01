package com.example.springbootproductseller.repository;

import com.example.springbootproductseller.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
