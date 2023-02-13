package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class KController {

    @GetMapping
    public void SaveCustomer(){
      //  System.out.println(id+" "+name+" "+address+" "+salary);
      System.out.println("Wade goda");
    }

}
