/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 3:54 PM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public ResponseUtil getAllCustomer(){
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        allCustomers.add(new CustomerDTO("C00-001","KASUN","GALLE",5000));
        allCustomers.add(new CustomerDTO("C00-002","NIMAL","COLOMBO",8000));
        allCustomers.add(new CustomerDTO("C00-003","PASAN","MATHARA",10000));
        allCustomers.add(new CustomerDTO("C00-004","NIMAL","KANDY",25000));

        return new ResponseUtil("200"," Success.",allCustomers);
    }

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO cus){
        System.out.println(cus.toString());
        return new ResponseUtil("200",cus.toString() +" Added",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO cus){
        System.out.println(cus.toString());
        return new ResponseUtil("200",cus.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        System.out.println(id);
        return new ResponseUtil("200",id+" Deleted.",null);
    }



}
