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
public class AddProductToBasketResponseBody implements Serializable{
    private long basketId;
    private int basketCapacity;

}
