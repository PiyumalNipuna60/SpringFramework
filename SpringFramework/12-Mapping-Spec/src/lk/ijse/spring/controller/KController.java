package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin // allow CrossOrigin access for this controller
//No need to set Access-Control-Headers anymore
public class KController {

    @PostMapping
    public void SaveCustomer(String id, String name, String address, double salary) {
        System.out.println(id + " " + name + " " + address + " " + salary);
        System.out.println("Wade goda");
    }

}
