package com.example.shoppingApplication.services;

import com.example.shoppingApplication.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shoppingApplication.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public Product addProduct(Product product){
        return this.productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        List<Product> getAllProductList = this.productRepository.findAll();
        return getAllProductList;
    }

    public List<Product> getProductById(int Id){
        List<Product> productId = this.getProductById(Id);
        return productId;
    }

}
