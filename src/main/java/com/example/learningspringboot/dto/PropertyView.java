package com.example.learningspringboot.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyView implements Serializable {
    private String value;
    private String valueType;
    private String name;
}
