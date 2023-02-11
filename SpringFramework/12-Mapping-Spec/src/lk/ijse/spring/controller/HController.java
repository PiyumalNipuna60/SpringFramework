package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eight")
public class HController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }

}
