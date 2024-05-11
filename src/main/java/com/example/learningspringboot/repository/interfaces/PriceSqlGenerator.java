package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.PropertyView;
import org.springframework.stereotype.Component;

@Component("price")
public class PriceSqlGenerator implements SqlGenerator{
    @Override
    public CharSequence generateJoin(PropertyView property, int number) {
        return "";
    }
    @Override
    public CharSequence generateWhere(PropertyView property, int number) {
        return "price <= :value_parameter_"+property.getName() + number;
    }
}
