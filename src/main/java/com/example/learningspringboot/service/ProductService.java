package com.example.learningspringboot.service;

import com.example.learningspringboot.dto.SearchProductRequestBody;
import com.example.learningspringboot.dto.SearchProductResponseBody;
import com.example.learningspringboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public SearchProductResponseBody searchProduct(SearchProductRequestBody body){
        return new SearchProductResponseBody(productRepository.findByFilters(body.getProperties()));
    }
}
