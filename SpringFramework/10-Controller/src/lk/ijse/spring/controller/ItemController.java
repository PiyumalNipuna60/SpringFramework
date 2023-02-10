package lk.ijse.spring.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/item")
public class ItemController {
    public ItemController(){
        System.out.println("ItemController Constructor..!");
    }

    @GetMapping
    public ModelAndView modelAndView(){
        return new ModelAndView("/Item");
    }
}
