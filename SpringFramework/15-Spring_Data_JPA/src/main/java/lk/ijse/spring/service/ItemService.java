package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.util.RespondUtil;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public interface ItemService {

    public void saveItem(ItemDTO dto);

    public void deleteItem(String code);

    public void updateItem(ItemDTO dto);

    public ArrayList<ItemDTO> getAllItems();
}
