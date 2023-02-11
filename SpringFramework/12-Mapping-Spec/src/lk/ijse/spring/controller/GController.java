package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seven")
public class GController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }


    //http://localhost:8080/mapping/seven?id=C001&name=IJSE
    //Narrow down request with query String Parameters

    @GetMapping(params = {"id","name"})
    public String testOne2(){
        return "GetMapping one invoke..!";
    }

    @GetMapping(params = {"address","salary"})
    public String testOne3(){
        return "GetMapping Two invoke..!";
    }

}
