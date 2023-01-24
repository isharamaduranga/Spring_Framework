package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemService {
    void addItem(ItemDTO itm);

    void deleteItem(String code);

    void updateItem(ItemDTO itm);

    ArrayList<ItemDTO> getAllItems();
}
