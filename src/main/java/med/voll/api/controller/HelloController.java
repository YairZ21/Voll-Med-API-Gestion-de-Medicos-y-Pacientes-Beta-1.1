package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//el rest es para apps rest no paginas web normales
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }

}