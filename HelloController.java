package com.example.LaptopExercise.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/helloTest")
    public String Saludar(){
        return "Hola Mundo";
    }
}
