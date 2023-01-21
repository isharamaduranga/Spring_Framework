/**
 * @author : Ishara Maduarnga
 * Project Name: Spring_fw
 * Date        : 1/21/2023
 * Time        : 1:37 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seven")
public class ControllerSeven {

    //  Consume Types (what the request hopes to consume with the request

   //With  the  value of application/json

    /** Alternative this  >> */ //@GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE} )
    @GetMapping(consumes = {"application/json"} )
    public String testOne(){
        return "Test One Method >> ";
    }

    //with  the  value of text/html
    @GetMapping(consumes = {"text/html"})
    public String testTwo(){
        return "Test Two Method >> ";
    }

}