package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Customer;
import lk.ijse.spring.pojo.Pojo1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitilizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();
        ant.registerShutdownHook();

        System.out.println("-------------------------");
        Pojo1 bean = ant.getBean(Pojo1.class);
        System.out.println(bean);

        System.out.println("-------------------------");
        Customer bean1 = ant.getBean(Customer.class);
        System.out.println(bean1);
    }
}
