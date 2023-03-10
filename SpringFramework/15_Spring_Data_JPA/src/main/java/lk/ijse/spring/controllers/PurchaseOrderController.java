/**
 * @author : Ishara Maduarnga
 * Project Name: Maven_Project
 * Date        : 2/5/2023
 * Time        : 11:55 AM
 * Year        : 2023
 */

package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.service.PurchaseOrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService service;
    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO dto){
        System.out.println(dto);
        service.purchaseOrder(dto);
        return new ResponseUtil("200","✔ Successfully Place Order...",null);
    }

    @GetMapping
    public ResponseUtil getAllOrders(){
        ArrayList<OrdersDTO> allOrders = service.getAllOrders();
        System.out.println(allOrders);
        return new ResponseUtil("200","Successfully load all orders",allOrders);
    }
}

