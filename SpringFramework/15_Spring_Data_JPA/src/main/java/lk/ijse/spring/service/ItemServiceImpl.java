/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 3:22 PM
 * Year        : 2023
 */

package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
@Service
@Transactional

public class ItemServiceImpl {
    @Autowired
    ItemRepo repo;
    @Autowired
    ModelMapper mapper;

    public void addItem(ItemDTO itm) {
        repo.save(mapper.map(itm, Item.class));
    }

    public void deleteItem(String code) {
        repo.deleteById(code);
    }

    public void updateItem(ItemDTO itm) {
        repo.save(mapper.map(itm, Item.class));
    }

    public ArrayList<ItemDTO> getAllItems() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<ItemDTO>>() {
        }.getType());
    }
}
