package com.example.azure_cosmos.service;

import com.azure.cosmos.models.PartitionKey;

import com.example.azure_cosmos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.azure_cosmos.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findProductByName(String productName) {
        return repository.findByProductName(productName);
    }

    public Optional<Product> findById(String productId, String category) {
        return repository.findById(productId, new PartitionKey(category));
    }

    public Optional<Product> findByIdAndCategory(String productId, String category){
        return repository.findByProductidAndProductCategory(productId,category);
    }


    public void saveProduct(Product product) {
        repository.save(product);
    }

    public void delete(String productId, String category) {
        repository.deleteById(productId, new PartitionKey(category));
    }
}