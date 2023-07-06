package com.example.application.repsitories;

import com.example.application.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByName(String name);
}
