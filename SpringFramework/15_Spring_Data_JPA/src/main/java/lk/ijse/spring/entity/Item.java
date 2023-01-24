/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 1:47 PM
 * Year        : 2023
 */

package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private double unitPrice;
}
