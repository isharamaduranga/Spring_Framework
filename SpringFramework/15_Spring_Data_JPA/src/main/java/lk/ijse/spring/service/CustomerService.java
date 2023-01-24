package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.modelmapper.TypeToken;

import java.util.ArrayList;

public interface CustomerService {

    public void addCustomer(CustomerDTO cus);

    public void deleteCustomer(String id);

    public void updateCustomer(CustomerDTO cus);

    public ArrayList<CustomerDTO> getAllCustomers();
}
