/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 11:14 PM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SpringBeanOne;
import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    public AppConfig() {

    }

    /**  Full Mode - Spring  */
  /*

   @Bean
    public SpringBeanTwo beanTwo(){
        //  inter Bean dependencies.
        SpringBeanThree b1 =  beanThree(); *//** Inter Bean dependency invocation.  *//*
        SpringBeanThree b2 =  beanThree(); *//** Inter Bean dependency invocation.  *//*
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("====================================================");
        return new SpringBeanTwo();

    }

    @Bean
    public SpringBeanThree beanThree(){
        return new SpringBeanThree();
    }

    */

}
