package com.example.learningspringboot.dto;

import com.example.learningspringboot.model.enums.EnergyClass;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LaptopView {
    private String vendor;
    private double price;
    private String brand;
    private EnergyClass energyClass;
    private String processor;
    private int ramCapacity;
    private int ssdCapacity;

    public LaptopView(String vendor, double price, String brand, EnergyClass energyClass, String processor, int ramCapacity, int ssdCapacity) {
        this.vendor = vendor;
        this.price = price;
        this.brand = brand;
        this.energyClass = energyClass;
        this.processor = processor;
        this.ramCapacity = ramCapacity;
        this.ssdCapacity = ssdCapacity;
    }
}
