package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.util.RespondUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepo repo;

    @GetMapping
    public RespondUtil getAllCustomer() {
        List<Customer> all = repo.findAll();
        return new RespondUtil("OK", "Successfully LoadAll.!", all);
    }

    @PostMapping
    public RespondUtil saveCustomer(@ModelAttribute CustomerDTO dto) {
        if (repo.existsById(dto.getId())) {
            throw new RuntimeException("Customer Already Exist. Please enter another id..!");
        }
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), String.valueOf(dto.getSalary()));
        repo.save(customer);

        return new RespondUtil("OK", "Successfully Registered.!", null);
    }

    @DeleteMapping(params = {"id"})
    public RespondUtil deleteCustomer(@RequestParam String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(id);
        return new RespondUtil("OK", "Successfully Deleted. :" + id, null);
    }

    @PutMapping
    public RespondUtil updateCustomer(@RequestBody CustomerDTO dto) {
        if (!repo.existsById(dto.getId())) {
            throw new RuntimeException("Wrong ID..No Such a Customer to Update..!");
        }
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), String.valueOf(dto.getSalary()));
        repo.save(customer);
        return new RespondUtil("OK", "Successfully Updated. :" + dto.getId(), null);
    }
}
