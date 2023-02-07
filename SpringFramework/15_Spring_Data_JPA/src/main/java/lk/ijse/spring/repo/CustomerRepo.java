package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    Customer findCustomerByName(String name);

    Customer findByNameAndAddress(String name,String address);

    //Customer findByName(String name);

    List<Customer> findByName(String name);

    Customer readByName(String name);
    Customer getByName(String name);
    Customer queryByName(String name);
    Customer searchByName(String name);
    Customer streamByName(String name);


    /** ==================================  */
    //CountBy data methods return by Long type data...
    Long countByName (String name);

    // If a query start with existBy then you should return boolean type data...
    Boolean  existsByAddress(String address);


    void deleteByName(String name);




}
