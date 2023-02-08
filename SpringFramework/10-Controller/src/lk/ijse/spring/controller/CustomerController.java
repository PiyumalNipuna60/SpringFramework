package lk.ijse.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    public CustomerController(){
        System.out.println("CustomerController Constructor..!");
    }

    @GetMapping
//    public void getCall(){
//        System.out.println("Method invoke");
//    }

    public ModelAndView getCall(){
        return new ModelAndView("This window load");
    }

}
