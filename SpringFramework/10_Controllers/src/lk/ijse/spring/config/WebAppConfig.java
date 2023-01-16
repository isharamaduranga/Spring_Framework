/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 4:01 PM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig instantiated");
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver =new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
