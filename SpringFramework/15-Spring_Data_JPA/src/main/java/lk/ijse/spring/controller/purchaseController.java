package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.ItemRepo;
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
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public RespondUtil purchaseOrder(@RequestBody OrdersDTO dto) {
        Orders map = mapper.map(dto, Orders.class);
        if (repo.existsById(map.getOid())){
            throw new RuntimeException("Order "+map.getOid()+ " Already Exist. Please enter another id..!");
        }
        repo.save(map);

        for (OrderDetails od : map.getOrderDetails()) {
            Item item = itemRepo.findById(od.getItemCode()).get();
            System.out.println(item);

            item.setQtyOnHand(item.getQtyOnHand()-od.getQty());
            itemRepo.save(item);
        }
        return new RespondUtil("OK", "Successfully Registered.!", null);

    }
}
