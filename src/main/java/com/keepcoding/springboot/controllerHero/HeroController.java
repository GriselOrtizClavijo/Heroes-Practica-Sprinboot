package com.keepcoding.springboot.controllerHero;

import com.keepcoding.springboot.Model.Hero;
import com.keepcoding.springboot.dao.HeroDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class HeroController {

    @Autowired
    private HeroDaoService heroDaoService;

    @GetMapping("/hero")
    public List<Hero> finAllHeroes(){
        return heroDaoService.findAllHeroes();
    };

    @GetMapping("/hero/{id}")
    public Hero findHeroById(@PathVariable int id){
        return heroDaoService.findHeroById(id);
    }

    //Devolver estado 201
    //Devolver la uri del nuevo recurso creado
    @PostMapping("/hero")
    public ResponseEntity<Object> addHero(@RequestBody Hero hero){
        Hero addedHero = heroDaoService.addHero(hero);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(addedHero.getId()).toUri();
       return ResponseEntity.created(location).build();
    }

    @DeleteMapping
    public boolean deleteHero(int id){
        return heroDaoService.deleteHero(id);
    }
}
