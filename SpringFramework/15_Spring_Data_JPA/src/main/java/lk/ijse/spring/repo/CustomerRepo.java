package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    /** ==================How To Write Own a Query using JPA Repository ================  */

    // Query (Native , SQL , JPQL ,HQL)

                /** ===================== NATIVE QUERY ========================*/

    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> testOneNativeQuery();

    @Query(value = "select * from Customer where name='smith'",nativeQuery = true)
    List<Customer> testTwoNativeQueryWithName();

    //Params
        //* Positions params
        //* Named params

    //SET THE PARAMETERS USING THE METHOD PARAMETER POSITION
    @Query(value = "select * from Customer where name=?1 and address=?2",nativeQuery = true)
    List<Customer> testTwoNativeQueryWithNameParam1(String name,String address);

    //SET THE PARAMETERS USING THE METHOD PARAMETER POSITION
    @Query(value = "select * from Customer where name=:n and address=:a",nativeQuery = true)
    List<Customer> testTwoNativeQueryWithNameParam2(@Param("n") String n, @Param("a ") String a);


    /** ===================== JPQL QUERY ========================*/

    @Query(value = "select u from Customer u where u.name=:name")
    Customer jpqlTestQuery(@Param("name")String name);



    /** ===================== HQL QUERY ========================*/

    @Query(value = "from Customer c where c.name=:name")
    Customer hqlTestQuery(@Param("name")String name);


}
