package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    public CustomerService service;

    @Test
    public void testCustomerSave(){

        //If I try to existing customer. if validation work there should be an error..
        CustomerDTO customerDTO1 = new CustomerDTO("C00-001","Maduranga","Mathara",195000);

        assertThrows(RuntimeException.class,() -> {
            //this test case will be ok if line throws an error
            service.addCustomer(customerDTO1);
        });

        //let's enter valid data and than check there are errors  or not
        CustomerDTO customerDTO2 = new CustomerDTO("C00-005","Maduranga","Mathara",195000);

        //this test case will be ok if line does not throws an error
        assertDoesNotThrow(() -> {
            service.addCustomer(customerDTO2);
        });
    }



}