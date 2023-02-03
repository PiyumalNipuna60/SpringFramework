package lk.ijse.Spring.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig Constructor..!");
    }
}
