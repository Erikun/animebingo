package com.erikun.bingobackend;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Document(collection = "bingo")
public interface AnimeRepository extends MongoRepository<Anime, String> {
    public List<Anime> findByName(String name);
}
