package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.model.ProductModel;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductModel> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/product")
    public ProductModel createProduct(@RequestBody ProductModel product) {
        return productService.createProduct(product);
    }

}
