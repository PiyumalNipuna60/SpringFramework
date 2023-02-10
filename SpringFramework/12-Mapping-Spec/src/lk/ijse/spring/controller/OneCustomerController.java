package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class OneCustomerController {

    @GetMapping
    public String testOne() {
        return "GetMapping invoke..!";
    }

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
