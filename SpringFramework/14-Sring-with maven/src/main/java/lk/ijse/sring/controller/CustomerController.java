package lk.ijse.sring.controller;

import lk.ijse.sring.dto.CustomerDTO;
import lk.ijse.sring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public ResponseUtil getAllCustomer() {
        ArrayList<CustomerDTO> allCustomer = new ArrayList();
        allCustomer.add(new CustomerDTO("C001","kamala","galle",2500));
        allCustomer.add(new CustomerDTO("C002","vimala","matara",3000));
        allCustomer.add(new CustomerDTO("C003","somapala","colombo",4000));
        allCustomer.add(new CustomerDTO("C004","gunapala","colombo",5000));
        return new ResponseUtil("OK","Successfully LoadAll.!",allCustomer);
    }

    @PostMapping
    public ResponseUtil saveCustomer(CustomerDTO dto) {
        System.out.println(dto.getId() + " " + dto.getName() + " " + dto.getAddress() + " " + dto.getSalary());
        return new ResponseUtil("OK", "Successfully Registered..!", null);
    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(String id){
        return new ResponseUtil("OK", "Successfully Deleted : "+id, null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(CustomerDTO dto){
        return new ResponseUtil("OK", "Successfully Update : "+dto.getId(), null);
    }
}
