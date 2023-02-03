package lk.ijse.Spring.config;

import lk.ijse.Spring.pojo.Pojo2;
import lk.ijse.Spring.pojo.Pojo3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.ijse.Spring")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Constructor..!");
    }

    @Bean

    public Pojo2 pojo2(){

        return new Pojo2();
    }

    @Bean
    public Pojo3 pojo3(){
        return new Pojo3();
    }
}
