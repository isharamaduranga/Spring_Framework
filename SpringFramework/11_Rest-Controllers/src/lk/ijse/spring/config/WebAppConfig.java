/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 4:50 PM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig instantiated");
    }
}
