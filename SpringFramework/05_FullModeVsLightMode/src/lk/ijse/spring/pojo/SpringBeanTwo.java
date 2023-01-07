/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 11:26 PM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo : Initiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanTwo : BeanName Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanTwo : BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanTwo : ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanTwo : Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanTwo : Destroyed Bean");
    }
}
