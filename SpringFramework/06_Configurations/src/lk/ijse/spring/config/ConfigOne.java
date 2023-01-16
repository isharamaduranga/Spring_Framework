/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 8:54 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigOne {
    public ConfigOne() {
        System.out.println("Config One  instantiated");
    }
    @Bean
    public SBeanTwo beanTwo(){
        return  new SBeanTwo();
    }
}
