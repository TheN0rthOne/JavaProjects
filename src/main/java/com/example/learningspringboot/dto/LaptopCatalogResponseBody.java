package com.example.learningspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class LaptopCatalogResponseBody implements Serializable {
    Set<LaptopView> laptopsForCatalog;

}
