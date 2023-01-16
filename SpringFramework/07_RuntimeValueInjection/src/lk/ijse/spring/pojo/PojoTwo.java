/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 10:30 AM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoTwo implements InitializingBean {

    @Value("Colombo")
    private String myAddress;

    public PojoTwo() {
        System.out.println("pojoTwo : Instantiated");
        System.out.println(myAddress);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myAddress);
    }
}
