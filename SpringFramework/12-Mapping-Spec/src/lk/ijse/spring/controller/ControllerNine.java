/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/21/2023
 * Time        : 4:35 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nine")
public class ControllerNine {


    @PostMapping
    public String testOne(String id, String name, String address, String salary) {
        return "Test One Invoked >> " + id + " : " + name + " : " + address + " : " + salary;
    }

    @PutMapping
    public String testTwo(String id, String name, String address, String salary) {
        return "Test Two Invoked >> " + id + " : " + name + " : " + address + " : " + salary;
    }

    @GetMapping
    public String testThree(String id, String name, String address, String salary) {
        return "Test Three Invoked >> " + id + " : " + name + " : " + address + " : " + salary;
    }

    @DeleteMapping
    public String testFour(String id, String name, String address, String salary) {
        return "Test Four Invoked >> " + id + " : " + name + " : " + address + " : " + salary;
    }
}
