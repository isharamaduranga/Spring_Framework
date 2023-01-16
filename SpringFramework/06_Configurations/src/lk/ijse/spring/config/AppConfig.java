/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 8:50 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigOne.class,ConfigTwo.class})
/** xml file configuration */
//@ImportResource("file:appConfig.xml")


public class AppConfig {

    public AppConfig() {
        System.out.println("App Config  instantiated");
    }
}
