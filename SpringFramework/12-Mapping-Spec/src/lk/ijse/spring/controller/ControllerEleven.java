/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 8:03 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.Dto.CustomerDTO;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/eleven")
public class ControllerEleven {

    @PostMapping
    public  String  testTwo(@RequestBody CustomerDTO dto){
        return "Test Two invoke post mapping  "+dto.toString();
    }

    @GetMapping
    public ArrayList<CustomerDTO> testThree(){
        ArrayList<CustomerDTO> cus = new ArrayList<>();
        cus.add(new CustomerDTO("C001","Ishara","Colombo",159000));
        cus.add(new CustomerDTO("C002","Janaka","Negombo",120000));
        cus.add(new CustomerDTO("C003","Oshan","Thalduwa",100000));
        return cus;
    }
}
