/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/17/2023
 * Time        : 9:37 AM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ControllerTwo {
    //Exact  Mapping

    //If there is an Ambiguous mapping
    //path = url

    @GetMapping
    public String defaultMapping(){
        return "Get Mapping  Default Method Invoked";
    }

    @GetMapping(path = "/m1")
    public String methodOne(){
        return "Get Mapping  One Invoked";
    }

    @GetMapping(path="/m2")
    public String methodTwo(){
        return "Get Mapping  Two Invoked";
    }

    @GetMapping(path="/m3")
    public String methodThree(){
        return "Get Mapping  Three Invoked";
    }

    @GetMapping(path="/m5/no/{C001}/ijse")
    public String methodFive(@PathVariable("C001") String id){
        return "Get Mapping  Five Invoked : "+id;
    }

    @GetMapping(path="/id/{id}/{name}")
    public String methodSix(@PathVariable String id,@PathVariable  String name){
        return "Get Mapping Six Invoked : "+id+" "+name;
    }



}
