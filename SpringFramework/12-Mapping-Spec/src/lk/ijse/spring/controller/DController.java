package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/four")
public class DController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }

    //Character Mapping
    // If you want to narrow down request using path segments
    //you can use character mapping
    //http://localhost:8080/mapping/C1DEF

    //if we have a doubt in exact mapping
    //we can use ? for that character
    @GetMapping(path = "/C?DEF")
    public String testOne2(){
        return "Method One Invoked";
    }

    @GetMapping(path = "/C??DEF")
    public String testTwo(){
        return "Method Two Invoked";
    }
}
