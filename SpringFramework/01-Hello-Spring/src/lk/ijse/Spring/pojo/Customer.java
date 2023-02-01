package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    public Customer(){
        System.out.println("Customer: Instantiated..!");
    }

    public void getCustomerName(){
        System.out.println("Customer Name is Sunil");
    }
}
