/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/21/2023
 * Time        : 2:19 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eight")
public class ControllerEight {

    @GetMapping(consumes = {"application/json"},produces = {MediaType.APPLICATION_JSON_VALUE} )
    public String testOne(){
        return "Test One Invoked >> ";
    }

    @GetMapping(produces = {"text/html"})
    public String testTwo(){
        return "Test Two Invoked >> ";
    }
}
