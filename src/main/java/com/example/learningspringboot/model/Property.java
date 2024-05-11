package com.example.learningspringboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "properties", schema = "learning_springboot")
public class Property {
    @Id
    @GeneratedValue
    private long id;
    private String value;
    private String valueType;
    private String name;
    @ManyToOne
    @JoinColumn(name = "product_vendor")
    private Product product;
}
