package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = List.of(
            new Product(1L, "Laptop", 15000000),
            new Product(2L, "Chuot khong day", 250000),
            new Product(3L, "Ban phim", 700000)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}