package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfig;
import lk.ijse.Spring.pojo.Customer;
import lk.ijse.Spring.pojo.DBConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();

        //Context Invocation
        Customer bean = ant.getBean(Customer.class);
        System.out.println(bean);

        bean.getCustomerName();


        ant.close();
    }
}
