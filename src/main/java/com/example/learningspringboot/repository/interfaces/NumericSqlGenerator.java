package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.PropertyView;
import org.springframework.stereotype.Component;

@Component("numeric")
public class NumericSqlGenerator implements SqlGenerator {
    //if number = 1 then return inner join p.properties properties1
    @Override
    public CharSequence generateJoin(PropertyView property, int number) {
        return "inner join p.properties properties" + number + " ";
    }

    //properties1.name = :enteredName1 and cast(properties1.value as double) <= :value_parameter_enteredName1
    //example for number = 1 property.name = "ssd", property.value = 15

    //properties1.name = :ssd1 and cast(properties1.value as double) <= :value_parameter_ssd_1

    //example for number = 1 property.name = "modes count", property.value = 15
    //properties1.name = :modes_count1 and cast(properties1.value as double) <= :value_parameter_modes_count1
    @Override
    public CharSequence generateWhere(PropertyView property, int number) {
        return "properties" + number + ".name = :" + property.getName().replace(" ", "_")+ number + " and cast(properties" + number + ".value as double) <= :value_parameter_" + property.getName().replace(" ", "_") + number;
    }
}
