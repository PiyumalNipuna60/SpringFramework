package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/eight")
public class HController {

    @GetMapping
    public String testOne1() {
        return "GetMapping invoke..!";
    }


    //How many parts are there in an HTTP request.?
    // There are two parts
    //Headers (Meta Data) "Content-Type=application/json"
    //Body (Context)

    //We can narrow down a request using the content type
    // of its body using headers
    //consume = (this method expect content-type header with the request)

    //    @GetMapping(consumes = {"application/json"})
    @GetMapping(consumes = {"Application/json"})
    public String testOne2(){
        return "GetMapping testOne2 invoke..!";
    }

        //       =======or====

        @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
        public String testOne3(){
            return "GetMapping testOne3 invoke..!";
        }

}
