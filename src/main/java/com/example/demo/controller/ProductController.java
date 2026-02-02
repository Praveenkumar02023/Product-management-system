package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ProductService;

import com.example.demo.model.ProductModel;

@RestController
public class ProductController {

    private ProductService productService = new ProductService();

    @GetMapping("/products")
    public List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

}
