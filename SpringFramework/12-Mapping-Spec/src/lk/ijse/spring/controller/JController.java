package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ten")
public class JController {

   @GetMapping
    public String test1(){
       return "ten : test1 method invoke..!";
   }

    //How many parts are there in an HTTP request.?
    // There are two parts
    //Headers (Meta Data) "Content-Type=application/json"
    //Body (Context)

    //consume = Content-Type=application/json
    //produce = Accept

    //Request Headers
    //Content-Type = Define what is the content type of the request body
    //Accept => what we want from the response body
    //Accept is a default header and always set this header to *\* (all) which means anything will be accepted from the server as the response


    //consume = Content-Type
    //produce = Accept


    //Request headers that we want to set if we want to invoke this method
    // Content-Type.?
    //Accept = application/json
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        return "Method One produces Invoked";
    }


    // Request headers that we want to set if we want to invoke this method
    // Content-Type = application/json
    //Accept = text/html

    //when we wanted to use both consume and produce we have an alternative for that
    //header attribute
    @GetMapping(headers = {"Content-Type=application/json","Accept=text/html"})
    public String testTwo(){
        return "Method Two headers Invoked";
    }
}
