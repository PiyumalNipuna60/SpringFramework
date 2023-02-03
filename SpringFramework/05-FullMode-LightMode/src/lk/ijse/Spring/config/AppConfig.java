package lk.ijse.Spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.ijse.Spring")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Constructor..!");
    }
}
