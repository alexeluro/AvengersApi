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
        this.HEROES.add(new Hero("Captain America", Gender.Male, "Steve Rogers",
                "https://cf-images.us-east-1.prod.boltdns.net/v1/static/5359769168001/0a823cb0-01a9-4835-a348-c64187783ccb/d37cb96c-805c-4aa2-9f2f-e62d9eb814c7/1280x720/match/image.jpg",
                false));
        this.HEROES.add(new Hero("Iron-Man", Gender.Male, "Tony Stark",
                "https://cnet1.cbsistatic.com/img/BFHZ88HgjJthGkJTYrOu8Qelmeo=/1200x675/2020/01/10/00378756-b8d2-4c51-a3e0-3db597493622/twitter-in-stream-wide-iron-man.jpg",
                true));
        this.HEROES.add(new Hero("Hulk", Gender.Male, "Bruce Banner",
                "https://i.ytimg.com/vi/MAfIvBgChjQ/maxresdefault.jpg",
                false));
        this.HEROES.add(new Hero("Black Widow", Gender.Female, "Natasha Romanova",
                "https://ichef.bbci.co.uk/news/1024/cpsprodpb/3190/production/_109988621_blackwidowtrailer.jpg",
                false));
        this.HEROES.add(new Hero("Dr Strange", Gender.Male, "Dr Steven Strange",
                "https://cdn.vox-cdn.com/thumbor/8w6m6Sdl8fkNt7UWPJr5hhNasqA=/0x0:1500x750/1400x1400/filters:focal(762x94:1002x334):format(jpeg)/cdn.vox-cdn.com/uploads/chorus_image/image/51717777/strange.0.jpg",
                true));
        this.HEROES.add(new Hero("Black Panther", Gender.Male, "T'Challa T'Chaka",
                "https://cdn.vox-cdn.com/thumbor/MKylVCkWKne60jVVRChMa0EcGw0=/0x0:2040x1360/1200x800/filters:focal(868x309:1194x635)/cdn.vox-cdn.com/uploads/chorus_image/image/58591729/BlackPanther596d2f04d1540_2040.0.jpg",
                false));
        this.HEROES.add(new Hero("Scarlet Witch", Gender.Female, "Wanda",
                "https://img1.looper.com/img/gallery/why-scarlet-witchs-powers-are-underrated/intro-1571667819.jpg",
                true));
        this.HEROES.add(new Hero("Captain Marvel", Gender.Female, "Carol Danvers",
                "https://i.insider.com/5c2fab7d01c0ea36df71bda4?width=1100&format=jpeg&auto=webp",
                true));
        this.HEROES.add(new Hero("Thor", Gender.Male, "Thor Odinson",
                "https://www.indiewire.com/wp-content/uploads/2019/04/D5Up3sIW0AEMM3R.jpg?w=780",
                true));
    }

    public List<Hero> getAllHeroes() {
        return HEROES;
    }




}
