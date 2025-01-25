package org.essential.estudiante_service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.application.name:No tiene nombre}")
    private String Appname;

    @Value("${titulo:No tiene titulo}")
    private String titulo;


    @GetMapping
    public ResponseEntity<String> WelcomeService(){
        return new ResponseEntity<>(titulo, HttpStatus.OK);
    }
}
