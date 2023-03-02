package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.util.RespondUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/purchase")
public class purchaseController {

    @Autowired
    private OrdersRepo repo;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public RespondUtil purchaseOrder(@RequestBody OrdersDTO dto) {
        System.out.println(dto.toString());

        Orders map = mapper.map(dto, Orders.class);
        repo.save(map);
        return new RespondUtil();
    }
}
