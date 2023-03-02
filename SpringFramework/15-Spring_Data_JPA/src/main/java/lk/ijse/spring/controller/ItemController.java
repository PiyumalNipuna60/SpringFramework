package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.util.RespondUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemRepo repo;

    @Autowired
    private ModelMapper mapper;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public RespondUtil saveItem(@ModelAttribute ItemDTO dto){
        if (repo.existsById(dto.getCode())){
            throw new RuntimeException(dto.getCode()+ " : Item already registered.!");
        }
        repo.save(mapper.map(dto, Item.class));
        return new RespondUtil("OK","Successfully Registered.!",null);
    }

    @DeleteMapping(params = {"code"})
    public RespondUtil deleteItem(@RequestParam String code){
        if (!repo.existsById(code)){
            throw new RuntimeException(code+ " : Item Not Exists to Delete.!");
        }
        repo.deleteById(code);
        return new RespondUtil("OK","Successfully Deleted. :"+code  ,null);
    }

    @PutMapping
    public RespondUtil updateItem(@RequestBody ItemDTO dto){
        if (!repo.existsById(dto.getCode())){
            throw new RuntimeException(dto.getCode()+ " : Item Not Exist for Update.!");
        }
        repo.save(mapper.map(dto, Item.class));
        return new RespondUtil("OK","Successfully Updated. :"+dto.getCode() ,null);
    }

    @GetMapping
    public RespondUtil getAllItems(){
        ArrayList<ItemDTO> list=mapper.map(repo.findAll(),new TypeToken< ArrayList<ItemDTO>>(){}.getType());
        return new RespondUtil("OK","Successfully Loaded. :" ,list);
    }

}
