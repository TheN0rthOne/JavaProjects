package com.example.learningspringboot.exceptions;

public class ProductNotFoundExtensions extends RuntimeException{
    public ProductNotFoundExtensions(String productId){
        super("Product not found: "+ productId);
    }
}
