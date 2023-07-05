package com.example.application.services;

import com.example.application.model.Product;
import com.example.application.repsitories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private List<Product> products = new ArrayList<>();

    public List<Product> productList(){return products;};

    public void saveProduct(Product product){
    }

    public void deleteProduct(Long id){
    }

    public Product getProductById(Long id){
        return  null;
    }
}
