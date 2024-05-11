package com.example.learningspringboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="users", schema="learning_springboot")
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private long id;

    @Column(name="fio")
    private String fio;

    @ManyToMany
    @JoinTable(name="products_at_basket",schema = "learning_springboot",
            inverseJoinColumns = @JoinColumn(name="product_id",referencedColumnName = "vendor"),
            joinColumns = @JoinColumn(name="user_id",referencedColumnName = "user_id"))
    private Set<Product> products;

    public User() {
    }

    public User(String fio) {
        this.fio = fio;
    }
}
