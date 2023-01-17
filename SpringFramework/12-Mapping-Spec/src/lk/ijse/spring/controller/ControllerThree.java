/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/17/2023
 * Time        : 10:12 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/three")
public class ControllerThree {

    //Mapping Spec Furthermore

    /**  Character matcher in path segments */
    @GetMapping(path = "C??1")
    public String testOne(){
        return  "Test One Invoked";
    }

    /*@GetMapping(path = "C??1")
    public String testTwo(){
        return  "Test Two Invoked";
    }*/



}
