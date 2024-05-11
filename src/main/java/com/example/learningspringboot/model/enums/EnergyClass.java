package com.example.learningspringboot.model.enums;

import java.util.Arrays;
import java.util.List;

public enum EnergyClass {
    A_3("A++"),
    A_2("A++"),
    A_1("A+"),
    A("A"),
    B("B"),
    C("C"),
    D("D");

    EnergyClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static final List<EnergyClass> values = Arrays.asList(EnergyClass.values());

    private final String value;
}
