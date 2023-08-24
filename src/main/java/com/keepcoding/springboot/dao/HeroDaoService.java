package com.keepcoding.springboot.dao;

import com.keepcoding.springboot.Model.Hero;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Qualifier("dao")
public class HeroDaoService implements HeroService{

    private static List<Hero> heroes = new ArrayList<>();

    static {
                heroes.add(new Hero(1, "Peter Parker", "Spiderman", new Date()));
                heroes.add(new Hero(2, "Bruce Banner", "Hulk", new Date()));
                heroes.add(new Hero(3, "Tony Stark", "Iron MAn", new Date()));
                heroes.add(new Hero(4, "Steve Rogers", "captain America", new Date()));
            };

    private static int counter = 4;

    //Obtener todos los héroes

    @Override
    public List<Hero> findAll() {
        return null;
    }

    //Obtener un héroe en concreto
    @Override
    public Hero findHeroById(int id){
        Hero result= null;
        for (Hero hero: heroes) {
            if (hero.getId() == id){
                result = hero;
            }
        }
        return result;
    }

    //Añadir un héroe nuevo

    @Override
    public Hero addHero(Hero hero){
        hero.setId(++counter);
        heroes.add(hero);
        return hero;

    }

    //borrar un héroe

    @Override
    public void deleteHero(int id){
        Iterator<Hero> heroIterator = heroes.iterator();
        Hero heroToRemove = null;
        do {
            heroToRemove = heroIterator.next();
            if(heroToRemove.getId() == id) {
                heroIterator.remove();
            }
        }
        while (heroIterator.hasNext());
    }

}
