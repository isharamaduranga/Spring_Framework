/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 6:18 PM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    public A() {
        System.out.println("Instantiated : A");
    }

    public void sendRequestB(){
        b.callMe();
    }
}
