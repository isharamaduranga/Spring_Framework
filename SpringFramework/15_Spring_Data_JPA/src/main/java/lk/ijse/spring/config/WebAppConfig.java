/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 10:32 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import lk.ijse.spring.advicer.AppWideExceptionHandler;
import lk.ijse.spring.controllers.CustomerController;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {CustomerController.class, AppWideExceptionHandler.class})
@EnableWebMvc
public class WebAppConfig {


}
