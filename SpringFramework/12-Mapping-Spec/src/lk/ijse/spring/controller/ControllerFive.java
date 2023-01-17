/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/17/2023
 * Time        : 10:39 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/five")
public class ControllerFive {
    // Duel Wild Card Mapping
    //Matches 0 more characters in a  segment
    //Matches  more than  one  segment

    // EG

    @GetMapping(path = "/one/**/two")
    public String testOne(){
        return "Test One  Method";
    }

    @GetMapping(path = "/two/one/**/last")
    public String testTwo(){
        return "Test Two  Method";
    }
}
