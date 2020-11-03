package com.inspiredcoda.avengers.controller;


import com.inspiredcoda.avengers.model.Hero;
import com.inspiredcoda.avengers.service.AvengersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController("/")
public class DefaultController {

    @Autowired
    private AvengersService avengersService;

    @RequestMapping(value = "/")
    public String defaultRequest(){
        return "type in dev/avengers";
    }

    @GetMapping(value = "/dev/avengers")
    public List<Hero> getAllAvengers(){
        return avengersService.getAllHeroes();
    }

    @GetMapping(value = "/dev/avengers/search")
    public List<Hero> getAvengers(@RequestParam(name = "code-name") String codeName){
        return avengersService.searchHero(codeName);
    }

    @GetMapping(value = "/dev/avengers/{id}")
    public Hero getSingleAvenger(@PathVariable(name = "id") UUID id){
        return avengersService.getSingleHero(id);
    }

    @PostMapping(value = "dev/avengers")
    public List<Hero> addNewAvenger(@RequestBody Hero hero){
        return avengersService.recruitNewAvenger(hero);
    }

    @DeleteMapping(value = "dev/avengers")
    public void deleteHero(@RequestBody Hero hero){
        avengersService.deleteHero(hero);
    }


}
