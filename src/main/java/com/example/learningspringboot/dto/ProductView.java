package com.example.learningspringboot.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProductView implements Serializable {
    private String vendor;
    private double price;
    private String brand;
    public ProductView() {
    }

    public ProductView(String vendor, double price, String brand) {
        this.vendor = vendor;
        this.price = price;
        this.brand = brand;
    }
}
