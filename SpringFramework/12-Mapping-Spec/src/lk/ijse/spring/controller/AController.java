package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class AController {

    @GetMapping
    public String testOne() {
        return "GetMapping invoke..!";
    }

//    @GetMapping
//    public String testOne2() {
//        return "GetMapping 2 invoke..!";
//    }  // ambiguous problem

    @PostMapping
    public String testTwo() {
        return "PostMapping invoke..!";
    }

    @PutMapping
    public String testThree() {
        return "PutMapping invoke..!";
    }

    @DeleteMapping
    public String testFour() {
        return "DeleteMapping invoke..!";
    }
}
