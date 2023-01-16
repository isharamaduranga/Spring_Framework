/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 10:40 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@PropertySource("classpath:application.properties")
@PropertySource("classpath:config.properties")
public class AppConfig {
    public AppConfig() {
    }
}
