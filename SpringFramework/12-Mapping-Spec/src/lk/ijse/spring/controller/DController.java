package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/four")
public class DController {

    @GetMapping
    public String testOne() {
        return "GetMapping invoke..!";
    }
}
