package com.example.springbootproductseller.service;

import com.example.springbootproductseller.model.Product;

import java.util.List;

public interface ProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts(String name,String description);
}