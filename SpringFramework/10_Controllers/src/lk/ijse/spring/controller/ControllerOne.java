/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 4:08 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/customer")
public class ControllerOne {
    public ControllerOne() {
        System.out.println("ControllerOne  Instantiated..");
    }

    @GetMapping
    public ModelAndView invokeMe(){
        return new ModelAndView("/customer");
    }
}
