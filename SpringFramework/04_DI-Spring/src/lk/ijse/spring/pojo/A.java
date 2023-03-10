/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 6:18 PM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class A implements /*DI,*/ BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Autowired
    private BSuper m ;

     /**
      *  @Autowired
      * private BSuper m ; */   //property Injection


   /** @Autowired
    *
    private BSuper m;
    public A(BSuper bb)  {
        this.m=bb;
        System.out.println("Instantiated : A");

    }*/                         //Constructor Injection

 /**  @Autowired
    public void setInjection(BSuper bb){
         this.m=bb;
   }*/                          //Setter Method Injection


 /**@Autowired
 @Override
    public void setInjection(BSuper bb) {
     this.m=bb;
 }   */                         // Interface  Injection



    public void sendRequestB(){
        m.callMe();
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Bean A :Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean A :Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean A :Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean A : Initializing Bean(Ready Bean)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean A : Disposable Bean(destroy Bean)");
    }



}
