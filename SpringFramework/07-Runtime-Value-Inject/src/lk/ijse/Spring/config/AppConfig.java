package lk.ijse.Spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor..!");
    }
}
