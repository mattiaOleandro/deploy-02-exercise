package co.develhope.deploy02exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @GetMapping
    public long sumRandomIntegers(){
        Random random = new Random();
        return random.nextInt(100) + random.nextInt(100);
    }
}
