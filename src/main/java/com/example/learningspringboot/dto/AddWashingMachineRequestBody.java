package com.example.learningspringboot.dto;

import com.example.learningspringboot.model.enums.EnergyClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddWashingMachineRequestBody {

    private String vendor;
    private double price;
    private LocalDate receiptDate;
    private String brand;
    private EnergyClass energyClass;
    private int modesCount;
    private double capacity;
}
