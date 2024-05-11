package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.PropertyView;
import org.springframework.stereotype.Component;

@Component("string")
public class StringSqlGenerator implements SqlGenerator {
    @Override
    public CharSequence generateJoin(PropertyView property, int number) {
        return "inner join p.properties properties" + number + " ";
    }

    //properties1.name = :enteredName1 and properties1.value ilike('%:value_parameter_enteredName1%')
    @Override
    public CharSequence generateWhere(PropertyView property, int number) {
        return "properties" + number + ".name = :" + property.getName().replace(" ", "_") + number +
                " and properties" + number + ".value ilike('%:value_parameter_" +
                property.getName().replace(" ", "_") + number + "%')";
    }
}
