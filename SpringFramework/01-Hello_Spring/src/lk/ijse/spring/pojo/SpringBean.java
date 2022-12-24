/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/24/2022
 * Time        : 6:01 PM
 * Year        : 2022
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean : Instantiated");
    }

    public void test(){
        System.out.println("Spring Bean Test Method Invoked..");
    }
}
