package com.keepcoding.springboot.helloWorld;

//Anotar la clase como un controlador
//Crear métodos que respondan a los endopoints
//Configurar esos métodos
// A Continuación se muestran dos maneras de realizarlo con el ejemplo del GET.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class HelloWorldController {

    // /helloWorld
    //GET

    /*@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public @ResponseBody String helloWorld(){
        return "Hello World";
    }*/

    @GetMapping(value = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "/hello-world-bean")
    public BeanResponse helloWorldBean(){
        return new BeanResponse("Hello World Bean");
    }

    @GetMapping(value = "/hello-world/path-variable/{name}")
    public String helloWorldVariable(@PathVariable String name){
        return "Hello " + name + "!";
    }
}
