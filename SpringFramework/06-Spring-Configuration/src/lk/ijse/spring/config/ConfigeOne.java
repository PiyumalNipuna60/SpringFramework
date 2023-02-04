package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigeOne {

    public ConfigeOne(){
        System.out.println("ConfigeOne Constructor..!");
    }

    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }
}
