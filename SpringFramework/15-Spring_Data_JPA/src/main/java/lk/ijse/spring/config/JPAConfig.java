package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class JPAConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource source, JpaVendorAdapter jpv){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPackagesToScan("lk.ijse.spring.entity");
        factoryBean.setDataSource(source);
        factoryBean.setJpaVendorAdapter(jpv);
        return factoryBean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource db = new DriverManagerDataSource();
        db.setDriverClassName("com.mysql.jdbc.Driver");
        db.setUrl("jdbc:mysql://localhost:3306/db?createDatabaseIfNotExist=true");
        db.setUsername("root");
        db.setPassword("1234");
        return db;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter jpa = new HibernateJpaVendorAdapter();
        jpa.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        jpa.setDatabase(Database.MYSQL);
        jpa.setGenerateDdl(true);
        jpa.setShowSql(true);
        return jpa;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);

    }
}
