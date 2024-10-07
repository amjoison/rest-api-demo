package com.joison.demo.REST.API.repository;

import com.joison.demo.REST.API.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}