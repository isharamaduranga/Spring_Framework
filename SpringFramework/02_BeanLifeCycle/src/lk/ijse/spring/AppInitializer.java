/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/25/2022
 * Time        : 1:14 PM
 * Year        : 2022
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

        /**  Let's Request Spring bean one from container */
        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean);


        /** Hooking Process  */

  /*      Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
            }
        }));*/

        /** Spring Alternative for the above Hooking Process  */

        // context will be closed just before jvm shutdown
        ctx.registerShutdownHook();

        // so you can request beans anywhere without hesitation
        SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean1);

    }
}
