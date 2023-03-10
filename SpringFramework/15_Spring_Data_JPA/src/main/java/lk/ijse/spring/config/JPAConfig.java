/**
 * @author : Ishara Maduarnga
 * Project Name: SpringFramework
 * Date        : 1/24/2023
 * Time        : 11:26 AM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.ItemRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement // aspect (Manage all my Transactions automatically using Transaction Manager)
@EnableJpaRepositories(basePackageClasses = {CustomerRepo.class, ItemRepo.class})  //Link Dao Classes
public class JPAConfig {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter jpa){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("lk.ijse.spring.entity");
        bean.setDataSource(ds);
        bean.setJpaVendorAdapter(jpa);
        return bean;
    }

    @Bean
    public  DataSource dataSource(){
        //We use this data source Only For Testing Purpose
        //If we are in Production we can use a DBCP pool
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_jpa?createDatabaseIfNotExist=true");
        ds.setUsername("root");
        ds.setPassword("1234");
        return ds;
    }
    /** org.hibernate.dialect.MySQL8Dialect */
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
        va.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        va.setDatabase(Database.MYSQL);
        va.setGenerateDdl(true);
        va.setShowSql(true);
        return va;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }
}
