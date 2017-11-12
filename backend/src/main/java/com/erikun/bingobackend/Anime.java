package com.erikun.bingobackend;

import org.springframework.data.annotation.Id;

public class Anime {

    @Id
    public String id;

    public String name;
    public String description;
    public String category;
    public String example;
    public String url;

    public Anime(String name, String description, String category, String example, String url) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.example = example;
        this.url = url;
    }

    @Override
    public String toString() {
        return String.format(
                "Square[id=%s, name='%s', description='%s', category='%s', example='%s', url='%s']",
                id, name, description, category, example, url);
    }
}
