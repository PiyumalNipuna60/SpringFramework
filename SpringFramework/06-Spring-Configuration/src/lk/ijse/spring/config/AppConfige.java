package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigeOne.class}) // class eka import karaganna
public class AppConfige {

    public AppConfige(){
        System.out.println("AppConfig Constructor..!");
    }
}
