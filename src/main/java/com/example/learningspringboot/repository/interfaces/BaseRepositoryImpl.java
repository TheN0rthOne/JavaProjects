package com.example.learningspringboot.repository.interfaces;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;

@Getter
public class BaseRepositoryImpl implements BaseRepository{
    @PersistenceContext
    public EntityManager entityManager;

}
