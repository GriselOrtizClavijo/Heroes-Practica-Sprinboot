package com.keepcoding.springboot.Repository;

import com.keepcoding.springboot.Model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {

    //si queremos definir algun campo en concreto por el que queremos efectuar una búsqueda

    //Hero findByName(String name);



}
