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


public class SpringBeanThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanThree() {
        System.out.println("SpringBeanThree : Initiated");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanThree : BeanName Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanThree : BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanThree : ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanThree : Initializing Bean");
        System.out.println("====================================================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanThree : Destroyed Bean");
    }
}
