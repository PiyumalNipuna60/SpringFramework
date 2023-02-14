package lk.ijse.sring.config;

import lk.ijse.spring.controller.AController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {AController.class})
@EnableWebMvc
public class AppConfig {
}
