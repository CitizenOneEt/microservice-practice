package com.microservicepractice.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservicepractice.productservice.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}