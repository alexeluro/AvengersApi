package com.inspiredcoda.avengers.service;

import com.inspiredcoda.avengers.model.Gender;
import com.inspiredcoda.avengers.model.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AvengersService {

    private List<Hero> HEROES = new ArrayList<>();

    public AvengersService() {
        this.HEROES.add(new Hero("Captain America", Gender.Male, "Steve Rogers", false));
        this.HEROES.add(new Hero("Iron-Man", Gender.Male, "Tony Stark", true));
        this.HEROES.add(new Hero("Hulk", Gender.Male, "Bruce Banner", false));
        this.HEROES.add(new Hero("Black Widow", Gender.Female, "Natasha Romanova", false));
        this.HEROES.add(new Hero("Dr Strange", Gender.Male, "Dr Steven Strange", true));
        this.HEROES.add(new Hero("Black Panther", Gender.Male, "T'Challa T'Chaka", false));
        this.HEROES.add(new Hero("Scarlet Witch", Gender.Female, "Wanda", true));
        this.HEROES.add(new Hero("Captain Marvel", Gender.Female, "Carol Danvers", true));
        this.HEROES.add(new Hero("Thor", Gender.Male, "Thor Odinson", true));
    }

    public List<Hero> getAllHeroes() {
        return HEROES;
    }




}
