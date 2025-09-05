package com.joseLeonardo.java.springboot.backend.services;
import java.util.List;
import java.util.Optional;
import com.joseLeonardo.java.springboot.backend.entities.Product;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Optional<Product> deleteById(Long id);
}
