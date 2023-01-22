/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/21/2023
 * Time        : 6:00 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.Dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ten")
public class ControllerTen {

    @PostMapping
    public  String  testTwo(@ModelAttribute CustomerDTO dto){
        return "Test Two invoke post mapping  "+dto.toString();
    }
}
