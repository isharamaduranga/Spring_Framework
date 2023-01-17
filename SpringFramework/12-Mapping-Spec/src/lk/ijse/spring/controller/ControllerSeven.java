/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/17/2023
 * Time        : 10:57 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seven")
public class ControllerSeven {
    //
    // EG :
    @GetMapping()
    public String testOne(){
        return "Test One  Method";
    }

    //
    // EG
    @GetMapping()
    public String testTwo(){
        return "Test Two  Method";
    }
}
