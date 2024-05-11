package com.example.learningspringboot.repository.interfaces;

import com.example.learningspringboot.dto.ProductView;
import com.example.learningspringboot.dto.PropertyView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class SearchProductRepositoryImpl extends BaseRepositoryImpl implements SearchProductRepository{

    @Autowired
    private Map<String, SqlGenerator> map;
    private final Set<String> FIELDS = Set.of("price", "brand");

    private String generateBeanName(String valueType){
        String generatedBeanName;
        if(FIELDS.contains(valueType)){
            generatedBeanName = valueType;
        }else{
            generatedBeanName = Objects.equals(valueType, "double")
                    || Objects.equals(valueType, "int") ? "numeric" : "string";
        }
        return generatedBeanName;
    }
    @Override
    public List<ProductView> findByFilters(List<PropertyView> properties) {
        StringBuilder hqlQuery = new StringBuilder("select new com.example.lerningspringboot.dto.ProductView(p.vendor, p.price, p.brand) from Product p ");
        for(int i = 0; i < properties.size(); i++){
            PropertyView property = properties.get(i);
            String beanName = generateBeanName(property.getValueType());
            if(map.containsKey(beanName)){
                hqlQuery.append(map.get(beanName).generateJoin(property, i));
            }
        }
        hqlQuery.append(" where ");
        Map<String, Object> parameters = new HashMap<>();
        for(int i = 0; i < properties.size(); i++) {
            PropertyView property = properties.get(i);
            String beanName = generateBeanName(property.getValueType());
            hqlQuery.append(map.get(beanName).generateWhere(property, i)).append(" and ");
            if(FIELDS.contains(beanName)){
                parameters.put("value_parameter_"+property.getName().replace(" ", "_")+i, property.getValue());
            }else{
                parameters.put(property.getName().replace(" ", "_")+i,property.getName());
                parameters.put("value_parameter_"+property.getName().replace(" ", "_")+i, property.getValue());
            }
        }
        hqlQuery.setLength(hqlQuery.length()-5);
        System.out.println(hqlQuery);


        var query = entityManager.createQuery(String.valueOf(hqlQuery));
        for(String key: parameters.keySet()){
            query.setParameter(key, parameters.get(key));
        }
        return query.getResultList();
    }
}
