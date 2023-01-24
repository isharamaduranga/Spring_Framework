/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 8:51 AM
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
public class ItemDTO {
    private String code;
    private String description;
    private int qtyOnHand;
    private double unitPrice;
}
