package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.PropertyView;
import org.springframework.stereotype.Component;

@Component("component")
public class BrandSqlGenerator implements SqlGenerator {
    @Override
    public CharSequence generateJoin(PropertyView property, int number) {
        return "";
    }

    @Override
    public CharSequence generateWhere(PropertyView property, int number) {
        return "brand = ilike('%:value_parameter_" + property.getName().replace(" ", "_") + number + "%')";
    }
}
