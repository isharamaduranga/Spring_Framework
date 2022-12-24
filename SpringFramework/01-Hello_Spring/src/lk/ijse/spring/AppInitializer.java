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

        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.test();
        System.out.println(bean);

        ctx.close();



    }
}
