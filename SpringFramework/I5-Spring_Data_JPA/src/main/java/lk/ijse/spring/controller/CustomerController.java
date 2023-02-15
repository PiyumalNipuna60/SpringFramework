package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.RespondUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public RespondUtil getAllCustomer() {
        ArrayList<CustomerDTO> allCustomer = new ArrayList();
        allCustomer.add(new CustomerDTO("C001","kamala","galle",2500));
        allCustomer.add(new CustomerDTO("C002","vimala","matara",3000));
        allCustomer.add(new CustomerDTO("C003","somapala","colombo",4000));
        allCustomer.add(new CustomerDTO("C004","gunapala","colombo",5000));
        return new RespondUtil("OK","Successfully LoadAll.!",allCustomer);
    }

    @PostMapping
    public RespondUtil saveCustomer(@ModelAttribute CustomerDTO dto){
        if (dto.getId().equals("C001")){
            throw new RuntimeException("Customer Already Exist. Please enter another id..!");
        }
        return new RespondUtil("OK","Successfully Registered.!",null);
    }

    @DeleteMapping(params = {"id"})
    public RespondUtil deleteCustomer(@RequestParam String id){
        if (id.equals("C001")){
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        return new RespondUtil("OK","Successfully Deleted. :"+id ,null);
    }

    @PutMapping
    public RespondUtil updateCustomer(@RequestBody CustomerDTO dto){
        if (dto.getId().equals("C001")){
            throw new RuntimeException("Wrong ID..No Such a Customer to Update..!");
        }
        return new RespondUtil("OK","Successfully Updated. :"+dto.getId() ,null);
    }
}
