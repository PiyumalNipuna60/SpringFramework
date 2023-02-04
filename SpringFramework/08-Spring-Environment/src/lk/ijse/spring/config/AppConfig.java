package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("lk.ijse.spring")
@PropertySource("classpath:Application.properties")
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig Constructor..!");
    }
}
