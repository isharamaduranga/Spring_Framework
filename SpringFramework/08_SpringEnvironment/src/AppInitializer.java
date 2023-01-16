import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 10:38 AM
 * Year        : 2023
 */

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /** From the OS  */
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println(key +" : "+value);
        }

        System.out.println("\n===================================================================================================================\n");

        /**  Java Environment  Variables */
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            Object value = properties.get(key);
            System.out.println(key +" : "+value);
        }

    }
}
