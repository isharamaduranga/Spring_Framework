import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/6/2023
 * Time        : 6:17 PM
 * Year        : 2023
 */

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        A beanA = ctx.getBean(A.class);
        beanA.sendRequestB();


        ctx.registerShutdownHook();
    }
}
