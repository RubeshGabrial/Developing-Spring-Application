package com.example.shoppingApplication.controller;

import com.example.shoppingApplication.domain.Product;
import jakarta.persistence.Id;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.shoppingApplication.services.ProductServiceImpl;

import java.util.List;

@RequestMapping("/product-data")
@RestController
public class ProductController {
    private ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService){
        this.productService=productService;
    }

    @PostMapping("/add")
    public ResponseEntity<Product> productAdd(@RequestBody Product product)
    {
        return new ResponseEntity<Product>(this.productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllProducts()
    {
        List<Product> productList = this.productService.getAllProducts();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @GetMapping("/getById")
    public ResponseEntity<?> getProductById(@RequestParam int productId)
    {
        List<Product> productid = this.productService.getProductById(productId);
        return new ResponseEntity<>(productid, HttpStatus.FOUND);
    }

}
