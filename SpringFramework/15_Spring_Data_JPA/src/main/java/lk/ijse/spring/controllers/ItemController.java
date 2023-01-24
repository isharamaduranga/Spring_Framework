/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 8:55 AM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemServiceImpl;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemRepo repo;
    @Autowired
    ModelMapper mapper;

    @Autowired
    ItemServiceImpl service;

    @GetMapping
    public ResponseUtil getAllItem() {
        ArrayList<ItemDTO> allItems = service.getAllItems();
        return new ResponseUtil("200", " Success.", allItems);
    }

    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO itm) {
        service.addItem(itm);
        return new ResponseUtil("200", itm.toString() + " Successfully Added..", null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO itm) {
        service.updateItem(itm);
        return new ResponseUtil("200", itm.toString() + " Successfully Updated..", null);
    }

    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code) {
        service.deleteItem(code);
        return new ResponseUtil("200", code + " Successfully Deleted.!!", null);
    }
}
