# REST: Aproximación al diseño
La clave es el concepto de Recurso

## SHIELD DATABASE
### Héroes
#### Obtener todos los héroes
````
GET/hero
HTTPResponseStatus: 200, 400, 500...
````
#### Insertar un nuevo superHéroe
````
POST/hero
Body: Información del héroe
HTTPResponseStatus: 201(Crear), 404, 500...
````
#### Obtener un héroe en concreto
````
GET/hero/{id}
HTTPResponseStatus: 200, 404, 500...
````

#### Borrar un héroe
````
DELETE/hero/{id}
HTTPResponseStatus: 200, 404, 500...
````

#### Poderes
Relación uno a muchos

#### Obtener todos los poderes de un héroe
````
GET/hero/{id}/power
````
#### Añadir un poder a un héroe
````
POST/hero/{id}/power
body: Detalles del poder a añadir
````

#### Obtener un poder en concreto de un héroe
````
GET/hero/{id}/power/{powerId}
````