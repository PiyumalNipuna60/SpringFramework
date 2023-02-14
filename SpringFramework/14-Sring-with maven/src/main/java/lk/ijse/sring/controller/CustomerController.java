package lk.ijse.sring.controller;

import lk.ijse.sring.dto.CustomerDTO;
import lk.ijse.sring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public void getCustomer() {
        System.out.println("CustomerController getCustomer invoke..!");
    }

    @PostMapping
    public ResponseUtil saveCustomer(CustomerDTO dto) {
        System.out.println(dto.getId() + " " + dto.getName() + " " + dto.getAddress() + " " + dto.getSalary());
        return new ResponseUtil("OK", "Successfully Registered..!", null);
    }
}
