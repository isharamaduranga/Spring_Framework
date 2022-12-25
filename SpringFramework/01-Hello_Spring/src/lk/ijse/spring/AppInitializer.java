/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/24/2022
 * Time        : 5:56 PM
 * Year        : 2022
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.DBConnection;
import lk.ijse.spring.pojo.SpringBean;
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
        BasicDataSource basicDataSource = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(basicDataSource);
        basicDataSource.AccsesPool();


        ctx.close();



    }
}
