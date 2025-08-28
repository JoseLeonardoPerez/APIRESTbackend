package com.joseleonardo.springboot.backend.springboot_backend.repositories;

import com.joseleonardo.springboot.backend.springboot_backend.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
