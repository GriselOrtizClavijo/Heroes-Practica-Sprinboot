package com.keepcoding.springboot.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

////Filtrado estático: también se puede colocar aquí la anotación @JsonIgnoreProperties(value = "password") especificando el valor que se quiere ignorar.

@JsonFilter("UserFilter") //Filtro dinámico ver controller
public class UserFilterDto {

    private int id;
    private String name;

    //@JsonIgnore //Filtrado estático: Esta anotación se utiliza para filtrar los datos que se quieren mostrar en el front, en este caso no se mostraría el password.
    private String password;

    public UserFilterDto() {
    }

    public UserFilterDto(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
