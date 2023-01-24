/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/22/2023
 * Time        : 4:10 PM
 * Year        : 2023
 */

package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;
}
