/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 3:49 PM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.controllers")
@EnableWebMvc
public class WebAppConfig {
}
