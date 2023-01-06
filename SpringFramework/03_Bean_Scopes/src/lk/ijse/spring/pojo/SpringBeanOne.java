/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/3/2023
 * Time        : 8:46 AM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*@Scope("singleton")*/ /** >>>  Alternative this */ //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanOne() {
        System.out.println("Spring Bean One :Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean One :Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One :Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One :Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One : Initializing Bean(Ready Bean)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One : Disposable Bean(destroy Bean)");
    }
}
