/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 3:54 PM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping
    public ResponseUtil getAllCustomer() {
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        return new ResponseUtil("200", " Success.", allCustomers);
    }

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO cus) {
        service.addCustomer(cus);
        return new ResponseUtil("200", cus.toString() + " Successfully Added..", null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO cus) {
        service.updateCustomer(cus);
        return new ResponseUtil("200", cus.toString() + " Successfully Updated..", null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id) {
        service.deleteCustomer(id);
        return new ResponseUtil("200", id + " Successfully Deleted.!!!", null);
    }


}
