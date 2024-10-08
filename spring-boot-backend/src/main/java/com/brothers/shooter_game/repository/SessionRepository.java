package com.brothers.shooter_game.repository;

import com.brothers.shooter_game.models.auth.Session;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SessionRepository extends MongoRepository<Session, String> {
    Session findByUsername(String username);
    void deleteByUsername(String username);
}
