package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    @Test
    public void addCustomer(){
        Customer customer = new Customer("C00-004","Kalindu","Ruwanwella",12000);
        customerRepo.save(customer);
    }

    @Test
    public void testOne() {
        List<Customer> customerList = customerRepo.findByName("Kalindu");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Test
    public void testTwo() {
        Customer data = customerRepo.findByNameAndAddress("Kalindu","Ruwanwella");
        System.out.println(data.toString());
    }

    @Test
    public void testThree() {

      //  Customer data1 = customerRepo.findByName("Kalindu");
        Customer data2 = customerRepo.readByName("Kalindu");
        Customer data3 = customerRepo.getByName("Kalindu");
        Customer data4 = customerRepo.queryByName("Kalindu");
        Customer data5 = customerRepo.searchByName("Kalindu");
        Customer data6 = customerRepo.streamByName("Kalindu");

       // System.out.println(data1.toString());
        System.out.println(data2.toString());
        System.out.println(data3.toString());
        System.out.println(data4.toString());
        System.out.println(data5.toString());
        System.out.println(data6.toString());

    }

    @Test
    public void testFour() {
        Long count = customerRepo.countByName("Kalindu");
        System.out.println(count);
    }

}
