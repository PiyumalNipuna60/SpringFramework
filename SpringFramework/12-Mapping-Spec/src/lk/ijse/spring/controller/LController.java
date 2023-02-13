package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class LController {

    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO dto){

        System.out.println(dto.toString());
    }
}
