/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 9:37 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    public AppConfig() {
      /*  System.out.println("App Config Instantiated..");*/
    }

  /*  @Bean
    public String name(){
        return "Hello ishara";
    }*/
}
