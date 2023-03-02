package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.util.RespondUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/purchase")
public class purchaseController {

    @PostMapping
    public RespondUtil purchaseOrder(@RequestBody OrdersDTO dto) {
        System.out.println(dto.toString());
        return new RespondUtil();
    }
}
