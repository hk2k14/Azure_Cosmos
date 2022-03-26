package com.example.azure_cosmos.config;

import com.azure.data.cosmos.CosmosKeyCredential;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
//import com.microsoft.azure.spring.data.cosmosdb.config.AbstractCosmosConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.CosmosDBConfig;
//import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.azure.data.cosmos.CosmosKeyCredential;
import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import com.microsoft.azure.spring.data.cosmosdb.config.CosmosDBConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCosmosRepositories(basePackages = "com.example.azure_cosmos.repository")
public class AzureCosmosDbConfiguration extends AbstractCosmosConfiguration {

    @Value("${azure.cosmos.uri}")
    private String uri;

    @Value("${azure.cosmos.key}")
    private String key;

    @Value("${azure.cosmos.database}")
    private String dbName;

    private CosmosKeyCredential cosmosKeyCredential;

    @Bean
    public CosmosDBConfig getConfig() {
        this.cosmosKeyCredential = new CosmosKeyCredential(key);
        CosmosDBConfig cosmosdbConfig = CosmosDBConfig.builder(uri, this.cosmosKeyCredential, dbName)
                .build();
        return cosmosdbConfig;
    }

    @Override
    protected String getDatabaseName() {
        return "Product-DB";
    }
}