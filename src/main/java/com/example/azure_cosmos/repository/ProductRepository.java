package com.example.azure_cosmos.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.example.azure_cosmos.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CosmosRepository<Product, String> {
    List<Product> findByProductName(String productName);

    Optional<Product> findByProductidAndProductCategory(String productid, String category);

}