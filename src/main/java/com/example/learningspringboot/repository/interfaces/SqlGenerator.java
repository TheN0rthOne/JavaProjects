package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.PropertyView;

public interface SqlGenerator {

    CharSequence generateJoin(PropertyView property, int number);
    CharSequence generateWhere(PropertyView property, int number);

}
