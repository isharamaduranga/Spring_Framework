/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/3/2023
 * Time        : 8:44 AM
 * Year        : 2023
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();


        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean);

        SpringBeanOne bean2 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean2);

        ctx.registerShutdownHook();
    }
}
