package com.example.learningspringboot.model;


import com.example.learningspringboot.model.enums.EnergyClass;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseProperties {
    @Column(name="price")
    private double price;
    @Column(name="receipt_date")
    private LocalDate receiptDate;
    @Column(name="brand")
    private String brand;
    @Column(name="energy_class")
    @Enumerated(EnumType.STRING)
    private EnergyClass energyClass;


}
