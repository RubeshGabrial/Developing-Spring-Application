package com.example.shoppingApplication.services;

import com.example.shoppingApplication.domain.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getProductById(int productId);

    public List<Product> getAllProducts();

}
