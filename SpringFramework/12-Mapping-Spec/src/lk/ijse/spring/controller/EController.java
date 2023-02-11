package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/five")
public class EController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }

     //Wild Card Mapping
    //Match one or more characters inside a path
    //segment
    //http://localhost:8080/mapping/five/path/1ormore/A/B

    @GetMapping("/path/*/A/B")
    public String testone1(){
        return "GetMapping Method 1 invoke..!";
    }

    @GetMapping("/*/path/A/B")
    public String testone2(){
        return "GetMapping Method 2 invoke..!";
    }

}
