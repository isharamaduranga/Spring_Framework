/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 8:55 AM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemRepo repo;

    @GetMapping
    public ResponseUtil getAllItem(){
        List<Item> itemList = repo.findAll();
        return new ResponseUtil("200"," Success.",itemList);
    }

    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO itm){
        Item item = new Item(itm.getCode(), itm.getDescription(), itm.getQtyOnHand(), itm.getUnitPrice());
        repo.save(item);
        return new ResponseUtil("200",itm.toString() +" Successfully Added..",null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO itm){
        Item item = new Item(itm.getCode(), itm.getDescription(), itm.getQtyOnHand(), itm.getUnitPrice());
        repo.save(item);
        return new ResponseUtil("200",itm.toString()+" Successfully Updated..",null);
    }

    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code){
        repo.deleteById(code);
        return new ResponseUtil("200",code+" Successfully Deleted.!!",null);
    }
}
