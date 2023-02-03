package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.ijse.spring")
public class ConfigeOne {

    public ConfigeOne(){
        System.out.println("ConfigeOne Constructor..!");
    }
}
