package com.example.learningspringboot.repository.interfaces;

import jakarta.persistence.EntityManager;

public interface BaseRepository {
    EntityManager getEntityManager(); // пулл потоков, в которых есть сессии

}
