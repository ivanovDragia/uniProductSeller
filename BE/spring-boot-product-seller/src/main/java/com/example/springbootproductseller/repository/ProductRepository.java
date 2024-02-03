package com.example.springbootproductseller.repository;

import com.example.springbootproductseller.model.Product;
import com.example.springbootproductseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>
{
    @Query("select p from Product p where (:name is null or p.name like %:name%) and (:description is null or p.description like %:description%)")
    List<Product> findAll(String name, String description);
}
