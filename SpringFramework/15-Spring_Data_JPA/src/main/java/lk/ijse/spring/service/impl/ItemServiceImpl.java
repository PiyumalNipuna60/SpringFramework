package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveItem(ItemDTO dto) {
        if (repo.existsById(dto.getCode())){
            throw new RuntimeException(dto.getCode()+ " : Item already registered.!");
        }
        repo.save(mapper.map(dto, Item.class));
    }

    @Override
    public void deleteItem(String code) {
        if (!repo.existsById(code)){
            throw new RuntimeException(code+ " : Item Not Exists to Delete.!");
        }
        repo.deleteById(code);
    }

    @Override
    public void updateItem(ItemDTO dto) {
        if (!repo.existsById(dto.getCode())){
            throw new RuntimeException(dto.getCode()+ " : Item Not Exist for Update.!");
        }
        repo.save(mapper.map(dto, Item.class));
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() {
        List<Item> all = repo.findAll();
        return mapper.map(all,new TypeToken< ArrayList<ItemDTO>>(){}.getType());
    }
}
