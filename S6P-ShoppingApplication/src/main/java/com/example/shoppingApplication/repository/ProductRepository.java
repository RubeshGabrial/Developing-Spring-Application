package com.example.shoppingApplication.repository;

import com.example.shoppingApplication.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
//public List <Product> findByProductName(String productName);
}
