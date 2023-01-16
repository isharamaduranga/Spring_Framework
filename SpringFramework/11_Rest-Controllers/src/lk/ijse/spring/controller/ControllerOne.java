/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 4:52 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class ControllerOne {

    @GetMapping
    public String getMethod(){
        return "Get Method";
    }
}
