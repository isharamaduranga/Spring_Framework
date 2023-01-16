import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.config.ConfigOne;
import lk.ijse.spring.config.ConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 8:48 AM
 * Year        : 2023
 */

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
     /*   ctx.register(ConfigOne.class);
        ctx.register(ConfigTwo.class);*/

        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
