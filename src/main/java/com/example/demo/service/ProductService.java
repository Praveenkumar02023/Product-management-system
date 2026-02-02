package com.example.demo.service;

import com.example.demo.repository.ProductRepository;
import com.example.demo.model.ProductModel;
import java.util.List;

public class ProductService {

    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

}
