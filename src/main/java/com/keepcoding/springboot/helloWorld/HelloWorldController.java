package com.keepcoding.springboot.helloWorld;

//Anotar la clase como un controlador
//Crear métodos que respondan a los endopoints
//Configurar esos métodos
// A Continuación se muestran dos maneras de realizarlo con el ejemplo del GET.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

//@Controller
@RestController
public class HelloWorldController {

    // /helloWorld
    //GET

    /*@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public @ResponseBody String helloWorld(){
        return "Hello World";
    }*/

    @Autowired
    private MessageSource messageSource;

    /*@GetMapping(value = "/hello-world")
    public String helloWorld(@RequestHeader(name= "Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("hello.world.message", null, locale);
    }*/

    //Si se quiere que el locale se coja desde el cliente que esté consultando ...
    @GetMapping(value = "/hello-world")
    public String helloWorld() {
        return messageSource.getMessage("hello.world.message", null, LocaleContextHolder.getLocale());
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
