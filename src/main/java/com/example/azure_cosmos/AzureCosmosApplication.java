package com.example.azure_cosmos;

import com.example.azure_cosmos.entity.Product;
import com.example.azure_cosmos.repository.ProductRepository;
import com.example.azure_cosmos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureCosmosApplication {



    public static void main(String[] args) {
        SpringApplication.run(AzureCosmosApplication.class, args);

//        ProductService ps = new ProductService();
//
//        Product product = new Product();
//        product.setProductid("1001");
//        product.setProductCategory("Shirt");
//        product.setPrice(110.0);
//        product.setProductName("Blue Shirt");
//
//        ps.saveProduct(product);
//
//        productRepository.save(product);

    }

}
