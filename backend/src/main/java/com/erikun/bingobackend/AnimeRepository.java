package com.erikun.bingobackend;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AnimeRepository extends MongoRepository<Anime, String> {
    public List<Anime> findByName(String name);
}
