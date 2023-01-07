/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 11:16 PM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanOne() {
        System.out.println("SpringBeanOne : Initiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne : BeanName Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanOne : BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne : ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanOne : Initializing Bean");
        System.out.println("====================================================");
    }


    /**  Light Mode - Spring  */
    @Bean
    public SpringBeanTwo beanTwo(){
        //  inter Bean dependencies.
        SpringBeanThree b1 =  beanThree();  /** Inter Bean dependency invocation.  */
        SpringBeanThree b2 =  beanThree();  /** Inter Bean dependency invocation.  */
        System.out.println(b1);
        System.out.println(b2);
        return new SpringBeanTwo();

    }

    @Bean
    public SpringBeanThree beanThree(){
        return new SpringBeanThree();
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne : Destroyed Bean");
    }


}
