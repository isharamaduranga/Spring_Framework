/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 12/25/2022
 * Time        : 10:29 AM
 * Year        : 2022
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("item")
public class ItemController {

    public ItemController() {
        System.out.println("Item Controller :Instantiated");
    }
}
