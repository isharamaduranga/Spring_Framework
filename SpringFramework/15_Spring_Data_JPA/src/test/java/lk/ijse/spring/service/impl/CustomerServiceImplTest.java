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
        CustomerDTO customerDTO = new CustomerDTO("C00-005","Maduranga","Mathara",195000);
        service.addCustomer(customerDTO);
    }

}