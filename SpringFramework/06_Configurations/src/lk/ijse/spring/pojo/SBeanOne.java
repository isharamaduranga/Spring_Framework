/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 8:50 AM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SBeanOne {
    public SBeanOne() {
        System.out.println("SBeanOne :  instantiated..");
    }
}
