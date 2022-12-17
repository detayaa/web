package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping
    public String hello() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String infromation(@RequestParam String name, String nameProject, String date, String describe) {
        return "Меня зовут " + name + ", название проекта " + nameProject + ", дата - " + date + ", описание: " + describe;
    }

}


