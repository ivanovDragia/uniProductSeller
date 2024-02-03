package com.example.springbootproductseller.controller;

import com.example.springbootproductseller.model.Product;
import com.example.springbootproductseller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")//pre-path
public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping //api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}") //api/product/{productId}
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
    {
        productService.deleteProduct(productId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/product
    public ResponseEntity<?> getAllProducts(@RequestParam(value = "name",required = false) String name,@RequestParam(value = "description",required = false) String description)
    {
        System.out.println(name);
        System.out.println(description);
        return new ResponseEntity<>(productService.findAllProducts(name,description), HttpStatus.OK);
    }
}
