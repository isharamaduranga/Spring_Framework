/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 11:26 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class JPAConfig {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        return bean;
    }
}
