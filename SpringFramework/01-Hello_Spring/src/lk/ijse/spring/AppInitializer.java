/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/24/2022
 * Time        : 5:56 PM
 * Year        : 2022
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        System.out.println("================================================");
        SpringBean bean1 = ctx.getBean(SpringBean.class);
        bean1.test();
        System.out.println(bean1);

        /** Bean id is(ID ---> @Component) : springBean (get Class Name and first letter simple and any others same as before..)  */
        SpringBean beanForID = (SpringBean) ctx.getBean("springBean");
        beanForID.test();

        System.out.println("================================================");

        DBConnection bean = ctx.getBean(DBConnection.class);
        System.out.println(bean);
        bean.getConnection();

        System.out.println("================================================");

        BasicDataSource bean2 = ctx.getBean(BasicDataSource.class);
        BasicDataSource bean3 = ctx.getBean(BasicDataSource.class);
        System.out.println(bean2);
        System.out.println(bean3);
        bean2.AccsesPool();


        System.out.println("================================================");

        /** Bean id is(ID ---> @Bean) : basicDataSource (get Configuration Class which related method Name )  */
        BasicDataSource basicDataSource = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(basicDataSource);
        basicDataSource.AccsesPool();

        System.out.println("================================================");

        ItemController item = (ItemController) ctx.getBean("item");
        System.out.println(item);

        System.out.println("================================================");
        BeanTwo two = (BeanTwo) ctx.getBean("bnTwo");
        two.beenTwoMethod();
        System.out.println(two);

        ctx.close();



    }
}
