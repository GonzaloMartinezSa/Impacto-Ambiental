# Mi Impacto Ambiental

## Introduccion
Este es un proyecto para ver el impacto ambiental de una organizacion. Esta basado en Java, con tests y de tipo fullstack,
siguiendo el modelo de tres capas `Dominio - Persistencia - Presentacion`.

Para usar: http://localhost:5000/inicio

![image](https://user-images.githubusercontent.com/82115481/213883701-fa6ce81a-da4c-43eb-9081-622adbaa3cfc.png)
![image](https://user-images.githubusercontent.com/82115481/213883755-1d4b02fe-a91d-423b-ad8c-19de853f6e41.png)
![image](https://user-images.githubusercontent.com/82115481/213883792-059bb79c-bdb8-44b4-aa9e-0b3537b18973.png)
![image](https://user-images.githubusercontent.com/82115481/213883817-374fc00b-4115-4633-b26c-3b62b583a684.png)
![image](https://user-images.githubusercontent.com/82115481/213883850-1e932cae-0ecd-47a3-b0d4-fe49f5183884.png)
![image](https://user-images.githubusercontent.com/82115481/213883904-09fc695c-ed58-4dc4-bce3-1a168599ab21.png)


## Perfiles de Usuario
* Admin
* Organizacion
* Miembro
* Agente Sectorial

## Funcionamiento
El funcionamiento principal consiste en cargar y relacionar organizaciones y miembros, con tal de poder, en distintos reportes,
visualizar el impacto ambiental (HC, huella de carbono) de esa organizacion. Esto se da por mediciones particulares y los trayectos
que realizan sus miembros para llegar a la org, teniendo en cuenta cosas como el medio (subte, colectivo, auto, bicicleta), el combustible y la distancia.
Esto le pega a una API externa de resultados no deterministicos. //TODO: implementar con una buena API de distancia.

## El proyecto usa: 

* Java 8. :warning: Si bien el proyecto no lo limita explícitamente, el comando `mvn verify` no funcionará con versiones mas modernas de Java. 
* JUnit 5. :warning: La versión 5 de JUnit es la más nueva del framework y presenta algunas diferencias respecto a la versión "clásica" (JUnit 4).
* Maven 3.3 o superior
* DB: MySQL (el nombre de la db es `dds`, y el usuario y contraseña es `root` y `mysql` en este caso. De tener otro, cambiar en el `persistence.xml`) 

## Otros frameworks usados:
* Mockito
* Retrofit
* JPA
* Hibernate
* Spark

