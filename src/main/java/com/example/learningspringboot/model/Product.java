package com.example.learningspringboot.model;

import com.example.learningspringboot.model.enums.EnergyClass;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "products", schema = "learning_springboot")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name="vendor")
    private String vendor;

    @Column(name="price")
    private double price;

    @Column(name="receipt_date")
    private LocalDate receiptDate;

    @Column(name="brand")
    private String brand;

    @Column(name="energy_class")
    @Enumerated(EnumType.STRING)
    private EnergyClass energyClass;


    @Column(name = "type")
    private String type;
    @ManyToMany
    @JoinTable(name="products_at_basket",schema = "learning_springboot",
            joinColumns = @JoinColumn(name="product_id",referencedColumnName = "vendor"),
            inverseJoinColumns = @JoinColumn(name="user_id",referencedColumnName = "user_id"))
    private Set<User> users;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Property> properties;
}
