/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 9:38 AM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {
 /*   @Autowired
    public PojoOne(@Value("Kandy,colombo,galle") String address[]) {
        System.out.println("Pojo One  Instantiated.."+address);

        for (String s : address) {
            System.out.println(s);
        }
    }*/


    @Autowired(required = false)
    public PojoOne(@Value("Kandy,colombo,galle") String address[]) {
        System.out.println("Pojo One  Instantiated.."+address);
        System.out.println("1 parameter");
        for (String s : address) {
            System.out.println(s);
        }
    }
    @Autowired(required = false)
    public PojoOne(@Value("Kandy,colombo,galle") String address[],@Value("ISHARA") String name) {
        System.out.println("Pojo One  Instantiated.."+address);
        System.out.println("Pojo One  Instantiated.."+name);
        System.out.println("2 parameter");
        for (String s : address) {
            System.out.println(s);
        }
    }

   /* public PojoOne(){
        System.out.println("Pojo One Default constructor..");
    }*/


}
