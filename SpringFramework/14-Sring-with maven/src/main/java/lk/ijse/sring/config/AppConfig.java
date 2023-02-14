package lk.ijse.sring.config;

import lk.ijse.sring.advisor.AppWideException;
import lk.ijse.sring.controller.CustomerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {CustomerController.class, AppWideException.class})
@EnableWebMvc
public class AppConfig {
}
