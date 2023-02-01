package lk.ijse.Spring.config;

import lk.ijse.Spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig: Instantiated..!");
    }

@Bean
    public BasicDataSource basicDataSource(){
        return new BasicDataSource();
    }
}
