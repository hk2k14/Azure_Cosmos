//package com.example.azure_cosmos;
//
//import com.azure.cosmos.models.PartitionKey;
//import com.example.azure_cosmos.entity.Product;
//import com.example.azure_cosmos.repository.ProductRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.util.Assert;
//
//@SpringBootTest
// class AzureCosmosDbApplicationManualTest {
//
//    @Autowired
//   ProductRepository productRepository;
//
//    @Test
//     void givenProductIsCreated_whenCallFindById_thenProductIsFound() {
//        Product product = new Product();
//        product.setProductid("1001");
//        product.setProductCategory("Shirt");
//        product.setPrice(110.0);
//        product.setProductName("Blue Shirt");
//
//        productRepository.save(product);
//        Product retrievedProduct = productRepository.findById("1001", new PartitionKey("Shirt");
//
//        System.out.println(retrievedProduct);
////        Assert.notNull(retrievedProduct, "Retrieved Product is Null");
//    }
//
//}