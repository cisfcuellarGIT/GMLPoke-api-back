# pokeapi-back

# Prueba Técnica - Transunion
Crear una aplicación Java, la cual:
- Debe tener una arquitectura de tres niveles
- Debe consumir el API RESTful https://pokeapi.co/api/v2/pokemon
- Debe traer los resultados paginados
- Debe exponer los resultados en un servicio SOAP y poderse consumir

## Requirements

For building and running the application you need:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Execute Test
```shell
mvn test
```

## Running the application locally

you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
