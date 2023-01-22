/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 3:54 PM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @PostMapping
    public String  saveCustomer(CustomerDTO dto){
        System.out.println(dto.toString());

        return "Customer Added";
    }

}
