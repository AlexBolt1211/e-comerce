package com.example.application;

/**
 * The project is an E-commerce platform and represents an online store for selling goods.
 *
 * The composition of the project is based on the MVC (Model-View-Controller) architectural pattern, which allows for
 * the separation of application logic, data representation, and user interface. The project code is written in the Java
 * programming language using the Spring framework for web application development.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EComerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EComerceApplication.class, args);
    }

}
