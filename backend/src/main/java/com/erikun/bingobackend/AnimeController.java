package com.erikun.bingobackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/anime")
public class AnimeController {
    private AnimeRepository animeRepository;

    @Autowired
    public void setRepository(AnimeRepository animeRepository){
        this.animeRepository = animeRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Anime> findAll(){
        return animeRepository.findAll();
    }
}
