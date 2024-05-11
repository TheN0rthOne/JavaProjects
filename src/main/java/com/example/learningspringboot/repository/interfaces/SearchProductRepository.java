package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.ProductView;
import com.example.learningspringboot.dto.PropertyView;

import java.util.List;

public interface SearchProductRepository {
    List<ProductView> findByFilters(List<PropertyView> properties);
}
