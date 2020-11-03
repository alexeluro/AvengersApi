package com.inspiredcoda.avengers.service;

import com.inspiredcoda.avengers.model.Gender;
import com.inspiredcoda.avengers.model.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AvengersService {

    private List<Hero> HEROES = new ArrayList<>();

    public AvengersService() {
        this.HEROES.add(new Hero("Captain America", Gender.Male, "Steve Rogers",
                "https://cf-images.us-east-1.prod.boltdns.net/v1/static/5359769168001/0a823cb0-01a9-4835-a348-c64187783ccb/d37cb96c-805c-4aa2-9f2f-e62d9eb814c7/1280x720/match/image.jpg",
                false,
                "Captain America is a superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 from Timely Comics, a predecessor of Marvel Comics."));
        this.HEROES.add(new Hero("Iron-Man", Gender.Male, "Tony Stark",
                "https://cnet1.cbsistatic.com/img/BFHZ88HgjJthGkJTYrOu8Qelmeo=/1200x675/2020/01/10/00378756-b8d2-4c51-a3e0-3db597493622/twitter-in-stream-wide-iron-man.jpg",
                true,
                "When Tony Stark, an industrialist, is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces to save the world."));
        this.HEROES.add(new Hero("Hulk", Gender.Male, "Bruce Banner",
                "https://i.ytimg.com/vi/MAfIvBgChjQ/maxresdefault.jpg",
                false,
                "The Hulk is a fictional superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk."));
        this.HEROES.add(new Hero("Black Widow", Gender.Female, "Natasha Romanova",
                "https://ichef.bbci.co.uk/news/1024/cpsprodpb/3190/production/_109988621_blackwidowtrailer.jpg",
                false,
                "At birth the Black Widow (aka Natasha Romanova) is given to the KGB, which grooms her to become its ultimate operative. When the U.S.S.R. breaks up, the government tries to kill her as the action moves to present-day New York, where she is a freelance operative."));
        this.HEROES.add(new Hero("Dr Strange", Gender.Male, "Dr Steven Strange",
                "https://cdn.vox-cdn.com/thumbor/8w6m6Sdl8fkNt7UWPJr5hhNasqA=/0x0:1500x750/1400x1400/filters:focal(762x94:1002x334):format(jpeg)/cdn.vox-cdn.com/uploads/chorus_image/image/51717777/strange.0.jpg",
                true,
                "In an accident, Stephen Strange, a famous neurosurgeon, loses the ability to use his hands. He goes to visit the mysterious Ancient One to heal himself and becomes a great sorcerer under her tutelage."));
        this.HEROES.add(new Hero("Black Panther", Gender.Male, "T'Challa T'Chaka",
                "https://cdn.vox-cdn.com/thumbor/MKylVCkWKne60jVVRChMa0EcGw0=/0x0:2040x1360/1200x800/filters:focal(868x309:1194x635)/cdn.vox-cdn.com/uploads/chorus_image/image/58591729/BlackPanther596d2f04d1540_2040.0.jpg",
                false,
                "After his father's death, T'Challa returns home to Wakanda to inherit his throne. However, a powerful enemy related to his family threatens to attack his nation."));
        this.HEROES.add(new Hero("Scarlet Witch", Gender.Female, "Wanda",
                "https://img1.looper.com/img/gallery/why-scarlet-witchs-powers-are-underrated/intro-1571667819.jpg",
                true,
                "The Scarlet Witch is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer Stan Lee and artist Jack Kirby. Her first appearance was in The X-Men #4 in the Silver Age of Comic Books."));
        this.HEROES.add(new Hero("Captain Marvel", Gender.Female, "Carol Danvers",
                "https://i.insider.com/5c2fab7d01c0ea36df71bda4?width=1100&format=jpeg&auto=webp",
                true,
                "Amidst a mission, Vers, a Kree warrior, gets separated from her team and is stranded on Earth. However, her life takes an unusual turn after she teams up with Fury, a S.H.I.E.L.D. agent."));
        this.HEROES.add(new Hero("Thor", Gender.Male, "Thor Odinson",
                "https://www.indiewire.com/wp-content/uploads/2019/04/D5Up3sIW0AEMM3R.jpg?w=780",
                true,
                "Thor, a powerful god of Asgard, is banished to the Earth by his father for his recklessness. Stripped of his divine power, he joins the other members of S.H.I.E.L.D to save earth from a dark force."));
    }

    public List<Hero> getAllHeroes() {
        return HEROES;
    }

    public List<Hero> recruitNewAvenger(Hero hero){
        HEROES.add(hero);
        return HEROES;
    }

    public List<Hero> deleteHero(Hero hero){
        Hero mHero = HEROES.stream()
                        .filter(hero1 -> hero1.getId().equals(hero.getId()))
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("No Hero Found"));
        HEROES.remove(mHero);
        return HEROES;
    }

    public List<Hero> searchHero(String codeName){
        return HEROES.stream()
                .filter(
                        hero ->
                                hero.getCodeName().contains(codeName.toLowerCase()) |
                                hero.getCodeName().contains(codeName.substring(0, 1).toUpperCase()) |
                                hero.getCodeName().startsWith(codeName.substring(0, 1).toUpperCase()) |
                                hero.getCodeName().equalsIgnoreCase(codeName)
                )
                .collect(Collectors.toList());
    }

    public Hero getSingleHero(UUID uuid){
        return HEROES.stream()
                .filter(hero -> hero.getId().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Avenger with that ID found!!!!"));
    }




}
