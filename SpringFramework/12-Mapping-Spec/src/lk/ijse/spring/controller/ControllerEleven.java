/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 8:03 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.Dto.CustomerDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eleven")
public class ControllerEleven {

    @PostMapping
    public  String  testTwo(@RequestBody CustomerDTO dto){
        return "Test Two invoke post mapping  "+dto.toString();
    }
}
