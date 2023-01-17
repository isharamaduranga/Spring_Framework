/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/17/2023
 * Time        : 9:19 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class ControllerOne {

    @GetMapping
    public String  testOne(){
        System.out.println("Test One Get Method Invoking");
        return "GET Method Invoked";
    }

 /*   @GetMapping
    public String  testOne_Second(){
        System.out.println("Test One second Get Method Invoking");
        return "GET Method Invoked -second";
    }*/


    @PostMapping
    public boolean  testTwo(){
        System.out.println("Test Two POST Method Invoking");
        return false; //need Converters
    }

    @DeleteMapping
    public void  testThree(){
        System.out.println("Test Three DELETE Method Invoking");
    }

    @PutMapping
    public void  testFour(){
        System.out.println("Test Four PUT Method Invoking");
    }
}
