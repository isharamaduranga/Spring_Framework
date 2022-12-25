/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/25/2022
 * Time        : 1:21 PM
 * Year        : 2022
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Spring Bean One :Instantiated");
    }
}
