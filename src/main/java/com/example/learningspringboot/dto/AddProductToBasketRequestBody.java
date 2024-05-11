package com.example.learningspringboot.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductToBasketRequestBody implements Serializable {
    private long userId;
    private String productVendor;
}
