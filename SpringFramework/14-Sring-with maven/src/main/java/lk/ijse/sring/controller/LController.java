package lk.ijse.sring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class LController {

    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDTO dto) {

        System.out.println(dto.toString());
    }

    @PutMapping
    public ArrayList<CustomerDTO> UpdateCustomer(@RequestBody CustomerDTO dto) {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        allCustomers.add(new CustomerDTO("C001", "Dasun", "Galle", 100));
        allCustomers.add(new CustomerDTO("C001", "Dasun", "Galle", 100));
        allCustomers.add(new CustomerDTO("C001", "Dasun", "Galle", 100));
        allCustomers.add(new CustomerDTO("C001", "Dasun", "Galle", 100));
        System.out.println(allCustomers);
        return allCustomers;
    }
}
