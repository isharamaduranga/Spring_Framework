/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 2:05 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class CustomerController {

    @GetMapping
    public String  hello(){
        return "Hello Spring";
    }
}
