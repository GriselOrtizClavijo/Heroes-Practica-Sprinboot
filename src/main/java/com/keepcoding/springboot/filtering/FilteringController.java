package com.keepcoding.springboot.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RestController
public class FilteringController {

    /*
    Así sencillo es para el filtrado estático
    @GetMapping("/filter")
    public UserFilterDto getUserFiltered(){
        return new UserFilterDto(1, "user1","123");
    }*/

    //Filtrado dinámico

    @GetMapping("/filter")
    public MappingJacksonValue getUserFiltered(@RequestParam String filterParams){
       UserFilterDto userFilterDto = new UserFilterDto(1, "user1","123");
       Set<String> filters = new HashSet<>(Arrays.asList(filterParams.split(",")));

       SimpleBeanPropertyFilter propertyFilter= SimpleBeanPropertyFilter.filterOutAllExcept(filters);
       FilterProvider filterProvider = new SimpleFilterProvider().addFilter("UserFilter", propertyFilter) ;
       MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(userFilterDto);
       mappingJacksonValue.setFilters(filterProvider);

       return mappingJacksonValue;
    }
}
