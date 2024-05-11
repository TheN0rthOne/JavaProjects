package com.example.learningspringboot.repository;

import com.example.learningspringboot.model.Product;
import com.example.learningspringboot.repository.interfaces.SearchProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String>, SearchProductRepository {

}
