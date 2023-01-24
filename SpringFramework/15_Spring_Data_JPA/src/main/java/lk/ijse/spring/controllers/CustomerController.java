/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 3:54 PM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerRepo repo;

    @GetMapping
    public ResponseUtil getAllCustomer(){
        List<Customer> all = repo.findAll();
        return new ResponseUtil("200"," Success.",all);
    }

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO cus){
        Customer customer = new Customer(cus.getId(), cus.getName(), cus.getAddress(), cus.getSalary());
        repo.save(customer);
        return new ResponseUtil("200",cus.toString() +" Successfully Added..",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO cus){
        Customer customer = new Customer(cus.getId(), cus.getName(), cus.getAddress(), cus.getSalary());
        repo.save(customer);
        return new ResponseUtil("200",cus.toString()+" Successfully Updated..",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        repo.deleteById(id);
        return new ResponseUtil("200",id+" Successfully Deleted.!!!",null);
    }



}
