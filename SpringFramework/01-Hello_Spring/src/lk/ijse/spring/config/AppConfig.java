/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/24/2022
 * Time        : 5:58 PM
 * Year        : 2022
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    public AppConfig() {
        System.out.println("App Config : Instantiated");
    }

    @Bean
    public BasicDataSource  basicDataSource(){
        return new BasicDataSource();
    }

}
