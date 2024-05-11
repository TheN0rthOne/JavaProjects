package com.example.learningspringboot.dto;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LaptopCatalogRequestBody implements Serializable {
    @Nullable
    Double price;
    @Nullable
    String brand;
    @Nullable
    String processor;
    @Nullable
    Integer ram;
    @Nullable
    Integer ssd;
}
