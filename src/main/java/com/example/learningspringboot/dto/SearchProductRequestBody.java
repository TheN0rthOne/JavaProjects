package com.example.learningspringboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchProductRequestBody {
    @Schema(description = "фильтры по свойствам товаров", example = "[\n" +
            "        {\n" +
            "            \"name\": \"price\",\n" +
            "            \"value\": \"50000\",\n" +
            "            \"valueType\": \"price\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"ram capacity\",\n" +
            "            \"value\": \"25\",\n" +
            "            \"valueType\": \"int\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\": \"ssd capacity\",\n" +
            "            \"value\": \"10000\",\n" +
            "            \"valueType\": \"int\"\n" +
            "        }\n" +
            "    ]")
    private List<PropertyView> properties;
}
