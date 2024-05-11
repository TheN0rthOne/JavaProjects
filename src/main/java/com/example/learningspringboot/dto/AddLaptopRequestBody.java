package com.example.learningspringboot.dto;

import com.example.learningspringboot.model.enums.EnergyClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddLaptopRequestBody implements Serializable {
    private String vendor;
    private double price;
    private String brand;
    private LocalDate receiptDate;
    private EnergyClass energyClass;
    private String processor;
    private int ramCapacity;
    private int ssdCapacity;

}
