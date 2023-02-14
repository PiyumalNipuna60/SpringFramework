package lk.ijse.sring.controller;

import lk.ijse.sring.dto.ItemDTO;
import lk.ijse.sring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @GetMapping
    public ResponseUtil getAllItem() {
        ArrayList<ItemDTO> allItem = new ArrayList();
        allItem.add(new ItemDTO("I001","Lux",200,100.00));
        allItem.add(new ItemDTO("I002","samahan",100,200.00));
        allItem.add(new ItemDTO("I003","Detol",20,300.00));
        allItem.add(new ItemDTO("I004","Vim",400,400.00));
        allItem.add(new ItemDTO("I005","Soya",250,500.00));
        return new ResponseUtil("OK","Successfully LoadAll",allItem);
    }

    @PutMapping
    public ResponseUtil updateItem(ItemDTO dto){
        return new ResponseUtil("OK","Successfully Update : "+dto.getCode(),null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil saveItem(ItemDTO dto){
        return new ResponseUtil("OK","Successfully saveItem : "+dto.getCode(),null);
    }

    @DeleteMapping(params = {"code"})
    public ResponseUtil updateCustomer(String code){
        return new ResponseUtil("OK","Successfully Update : "+code,null);
    }
}
