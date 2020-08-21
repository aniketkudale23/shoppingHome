package com.example.shoppingHome.shoppingHome.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class ShoppingConfig {

    @Value("${spring.data.mongodb.port}")
    private String mongoPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoName;

//    public @Bean
//    MongoTemplate mongoTemplate() throws Exception {
//
//        MongoTemplate mongoTemplate =
//                new MongoTemplate(new MongoClient(mongoPort), mongoName);
//        return mongoTemplate;
//
//    }
}
