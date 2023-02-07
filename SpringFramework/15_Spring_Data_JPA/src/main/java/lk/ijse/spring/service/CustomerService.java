package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    void addCustomer(CustomerDTO cus);

    void deleteCustomer(String id);

    void updateCustomer(CustomerDTO cus);

    ArrayList<CustomerDTO> getAllCustomers();

    public CustomerDTO searchCustomerByName(String name);
}
