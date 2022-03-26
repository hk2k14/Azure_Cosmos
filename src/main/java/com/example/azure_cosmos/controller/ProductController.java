package com.example.azure_cosmos.controller;

import com.example.azure_cosmos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.azure_cosmos.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "/send")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @GetMapping(value = "/{id}/category/{category}")
    public Optional<Product> get(@PathVariable String id, @PathVariable String category) {
        //return productService.findById(id, category);
        return productService.findByIdAndCategory(id,category);
    }

    @DeleteMapping(value = "/{id}/category/{category}")
    public void delete(@PathVariable String id, @PathVariable String category) {
        productService.delete(id, category);
    }

    @GetMapping
    public List<Product> getByName(@RequestParam String name) {
        return productService.findProductByName(name);
    }

}
