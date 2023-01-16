/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/10/2023
 * Time        : 10:41 AM
 * Year        : 2023
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {
    @Value("${os.name}")
    private String  myOSName;

    @Value("${USERNAME}")
    private String  myLOGName;

    @Value("${my.project}")
    private String myProjectName;

    @Value("${project.option}")
    private String myProjectOption;

    @Autowired
    Environment env;


    public PojoOne() {
        System.out.println("Pojo One instantiated...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myOSName);
        System.out.println(myLOGName);
        System.out.println(myProjectName);
        System.out.println(myProjectOption);


        String property = env.getProperty("my.name");
        System.out.println(property);

        System.out.println("\n\n");
    }
}
