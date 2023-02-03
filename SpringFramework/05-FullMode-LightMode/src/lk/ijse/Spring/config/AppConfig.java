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
    //Full Mode
    public Pojo2 pojo2(){
        //Inter-bean Dependency Invocation
        Pojo3 pojo31 = pojo3();
        Pojo3 pojo32 = pojo3();
        System.out.println(pojo31);
        System.out.println(pojo32);
        return new Pojo2();
    }

    @Bean
    public Pojo3 pojo3(){
        return new Pojo3();
    }
}
