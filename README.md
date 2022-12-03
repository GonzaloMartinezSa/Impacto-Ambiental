# Mi Impacto Ambiental

## Introduccion
Este es un proyecto para ver el impacto ambiental de una organizacion. Esta basado en Java, con tests y de tipo fullstack,
siguiendo el modelo de tres capas `Dominio - Persistencia - Presentacion`.

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

## Otros frameworks usados:
* Mockito
* Retrofit
* JPA
* Hibernate
* Spark

