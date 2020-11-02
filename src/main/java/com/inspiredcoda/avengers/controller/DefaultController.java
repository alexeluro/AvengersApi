package com.inspiredcoda.avengers.controller;


import com.inspiredcoda.avengers.model.Hero;
import com.inspiredcoda.avengers.service.AvengersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class DefaultController {

    @Autowired
    private AvengersService avengersService;

    @RequestMapping(value = "/")
    public String defafaultRequest(){
        return "type in dev/avengers";
    }


    @GetMapping(value = "/dev/avengers")
    public List<Hero> getAllAvengers(){
        return avengersService.getAllHeroes();
    }


}
