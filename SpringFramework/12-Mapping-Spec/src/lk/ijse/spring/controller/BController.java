package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class BController {

    @GetMapping
    public String testOne() {
        return "GetMapping 1 invoke..!";
    }

    @GetMapping(path = "/a")
    public String testOne2() {
        return "GetMapping 2 invoke..!";
    }

    @GetMapping(path = "/b")
    public String testOne3() {
        return "GetMapping 3 invoke..!";
    }
    @GetMapping(path = "/b/c")
    public String testOne4() {
        return "GetMapping 4 invoke..!";
    }
}
