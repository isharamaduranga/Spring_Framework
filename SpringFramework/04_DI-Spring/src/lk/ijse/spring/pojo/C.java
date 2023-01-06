/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 8:00 PM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class C implements BSuper, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public C() {
        System.out.println("C : Instantiated ");
    }

    @Override
    public void callMe() {
        System.out.println("C Call Me Method Invoked");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean C :Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean C :Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean C :Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean C : Initializing Bean(Ready Bean)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean C : Disposable Bean(destroy Bean)");
    }

}
