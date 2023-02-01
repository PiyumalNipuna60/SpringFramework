package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfig;
import lk.ijse.Spring.pojo.BasicDataSource;
import lk.ijse.Spring.pojo.Customer;
import lk.ijse.Spring.pojo.DBConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();

        System.out.println("---------------");
        //Context Invocation
        Customer bean = ant.getBean(Customer.class);
        System.out.println(bean);
        bean.getCustomerName();


        System.out.println("---------------");
        BasicDataSource bean1 = ant.getBean(BasicDataSource.class);
        BasicDataSource bean2 = ant.getBean(BasicDataSource.class);
        System.out.println(bean1);
        System.out.println(bean2);

        System.out.println("====Bean ID======");
        //@Component
        //Customer -> customer (beanID) get the class name and then
        //convert the first letter into simple letter

        Customer customer1 = (Customer) ant.getBean("customer");
        System.out.println(customer1);

        ant.close();
    }
}
