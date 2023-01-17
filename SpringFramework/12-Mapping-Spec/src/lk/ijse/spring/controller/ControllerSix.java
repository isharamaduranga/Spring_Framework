/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/17/2023
 * Time        : 10:44 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/six")
public class ControllerSix {

    // send  id  , name
    // EG :http://localhost:8080/mappingspec/six?id=C001&name=Maduranga
    @GetMapping(params = {"id","name"})
    public String testOne(String id,String name){
        return "Test One  Method"+id+" : "+name;
    }

    // send  address  , salary
    // EG http://localhost:8080/mappingspec/six?address=Colombo&salary=458000
    @GetMapping(params = {"address","salary"})
    public String testTwo(String address,String salary){
        return "Test Two  Method"+address+" : "+salary;
    }
}
