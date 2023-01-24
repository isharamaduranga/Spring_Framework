/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 2:46 PM
 * Year        : 2023
 */

package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo repo;
    @Autowired
    ModelMapper mapper;

    @Override
    public void addCustomer(CustomerDTO cus) {
        if (repo.existsById(cus.getId())) {
            throw new RuntimeException("Customer "+cus.getId()+" Already Exist..!");
        }
        repo.save(mapper.map(cus, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Customer "+id+" Not Available to Delete !!!.");
        }
        repo.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDTO cus) {
        repo.save(mapper.map(cus, Customer.class));
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<CustomerDTO>>() {
        }.getType());
    }
}
