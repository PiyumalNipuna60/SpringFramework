package lk.ijse.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor..!");
    }

/*    @Bean
    public String setD(){
        return "Hello Nipuna";
    }*/
}
