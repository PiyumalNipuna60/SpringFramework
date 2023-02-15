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
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){
        if (dto.getId().equals("C001")){
            throw new RuntimeException("Customer Already Exist. Please enter another id..!");
        }
        return new ResponseUtil("OK","Successfully Registered.!",null);
    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam String id){
        if (id.equals("C001")){
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        return new ResponseUtil("OK","Successfully Deleted. :"+id ,null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        if (dto.getId().equals("C001")){
            throw new RuntimeException("Wrong ID..No Such a Customer to Update..!");
        }
        return new ResponseUtil("OK","Successfully Updated. :"+dto.getId() ,null);
    }
}
