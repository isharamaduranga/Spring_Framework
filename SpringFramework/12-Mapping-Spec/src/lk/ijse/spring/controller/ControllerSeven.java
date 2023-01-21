/**
 * @author : Ishara Maduarnga
 * Project Name: Spring_fw
 * Date        : 1/21/2023
 * Time        : 1:37 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seven")
public class ControllerSeven {

    //mapping with query parameters


    @GetMapping(consumes = {"application/json"} )
    public String testOne(){
        return "Test One Method >> ";
    }


    @GetMapping(consumes = {"text/html"})
    public String testTwo(){
        return "Test Two Method >> ";
    }

}