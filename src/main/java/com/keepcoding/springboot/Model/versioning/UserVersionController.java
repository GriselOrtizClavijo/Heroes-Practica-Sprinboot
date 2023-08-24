package com.keepcoding.springboot.Model.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersionController {

    //URI (AMAZON)

    @GetMapping("/v1/userVersioning")
    public UserVersionV1 getUserVersionV1(){
        return new UserVersionV1("nombre");
    };

    @GetMapping("/v2/userVersioning")
    public UserVersionV2 getUserVersionV2(){
        return new UserVersionV2(new NameStructure("nombre", "apellido"));
    }

    //PARAMS(TWITTER)

    @GetMapping(value = "/userVersioning/params", params = "version=1")
    public UserVersionV1 getUserVersionV1Params(){
        return new UserVersionV1("nombre");
    };

    @GetMapping(value = "/userVersioning/params", params = "version=2")
    public UserVersionV2 getUserVersionV2Params(){
        return new UserVersionV2(new NameStructure("nombre", "apellido"));
    }

    //HEADER (MICROSOFT)

    @GetMapping(value = "/userVersioning/header", headers = "X-API-VERSION=1")
    public UserVersionV1 getUserVersionV1header(){
        return new UserVersionV1("nombre");
    };

    @GetMapping(value = "/userVersioning/header", headers = "X-API-VERSION=2")
    public UserVersionV2 getUserVersionV2header(){
        return new UserVersionV2(new NameStructure("nombre", "apellido"));
    }

    //MEDIA TYPE .... SE INDICA EN EL ACCEPT DEL HEADER (GITHUB)

    @GetMapping(value = "/userVersioning/produces", produces = "application/vnd.company.app-v1+json")
    public UserVersionV1 getUserVersionV1Produces(){
        return new UserVersionV1("nombre");
    };

    @GetMapping(value = "/userVersioning/produces", produces = "application/vnd.company.app-v2+json")
    public UserVersionV2 getUserVersionV2Produces(){
        return new UserVersionV2(new NameStructure("nombre", "apellido"));
    }

    //Media Type (github)
    //Header (Microsoft)
    //Params(Twitter)
    //URI (Amazon)


    //URI afecta las uris de nuestra API, se debe añadir todo el tiempo la versión
    // No es recomendable usar las headers para versionar, no fueron creadas con la intención de versionar una API
    //dificultad el cacheo
    //Browser vs Rest Client, tanto el media type como el header, nos va a obligar un cliente rest.
    //Documentación: facilita bastante con params o URI

}
