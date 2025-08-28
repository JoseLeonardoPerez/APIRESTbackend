package com.joseleonardo.springboot.backend.springboot_backend.services;

import com.joseleonardo.springboot.backend.springboot_backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Optional<Product> deleteById(Long id);

}
