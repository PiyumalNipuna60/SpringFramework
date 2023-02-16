package lk.ijse.spring.controller;

import jdk.nashorn.internal.runtime.RewriteException;
import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.RespondUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @GetMapping
    public RespondUtil getAllItem() {
        ArrayList<ItemDTO> allItem = new ArrayList();
        allItem.add(new ItemDTO("I001","Lux",200,100.00));
        allItem.add(new ItemDTO("I002","samahan",100,200.00));
        allItem.add(new ItemDTO("I003","Detol",20,300.00));
        allItem.add(new ItemDTO("I004","Vim",400,400.00));
        allItem.add(new ItemDTO("I005","Soya",250,500.00));
        return new RespondUtil("OK","Successfully LoadAll",allItem);
    }

    @PutMapping
    public RespondUtil updateItem(ItemDTO dto){
        return new RespondUtil("OK","Successfully Update : "+dto.getCode(),null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public RespondUtil saveItem(ItemDTO dto){
        return new RespondUtil("OK","Successfully saveItem : "+dto.getCode(),null);
    }

    @DeleteMapping(params = {"code"})
    public RespondUtil updateCustomer(String code){
        return new RespondUtil("OK","Successfully Update : "+code,null);
    }
}
