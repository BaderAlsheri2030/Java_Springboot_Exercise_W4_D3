package com.example.project1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class welcomeController {

    @GetMapping("/name")
    public String name() {
        return "My name is Bader";
    }
    @GetMapping("/age")
    public String myAge(){
        return "My age is 24";
    }
    @GetMapping("/check/status")
    public String check(){
        return "Everything is ok";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String> n = new ArrayList<>();
        n.add("bader");
        n.add("Khaled");
        n.add("Abdullah");
        n.add("Muhammed");
        return n;
    }
}
