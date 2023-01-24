/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 8:55 AM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @GetMapping
    public ResponseUtil getAllItem(){
        ArrayList<ItemDTO> allItems= new ArrayList<>();
        allItems.add(new ItemDTO("I00-001","NOODLES",500,720));
        allItems.add(new ItemDTO("I00-002","PASTA",600,480));
        allItems.add(new ItemDTO("I00-003","MILK",1500,1220));
        allItems.add(new ItemDTO("I00-004","DHALL",1740,350));

        return new ResponseUtil("200"," Success.",allItems);
    }

    @PostMapping
    public ResponseUtil saveItem(@ModelAttribute ItemDTO itm){
        System.out.println(itm.toString());
        return new ResponseUtil("200",itm.toString() +" Added",null);
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO itm){
        System.out.println(itm.toString());
        return new ResponseUtil("200",itm.toString()+" Updated",null);
    }

    @DeleteMapping(params = "code")
    public ResponseUtil deleteItem(String code){
        System.out.println(code);
        return new ResponseUtil("200",code+" Deleted.",null);
    }
}
