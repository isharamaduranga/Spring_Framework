/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/24/2022
 * Time        : 5:56 PM
 * Year        : 2022
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean1 = ctx.getBean(SpringBean.class);
        SpringBean bean2 = ctx.getBean(SpringBean.class);
        bean1.test();
        System.out.println(bean1);
        System.out.println(bean2);


        ctx.close();



    }
}
