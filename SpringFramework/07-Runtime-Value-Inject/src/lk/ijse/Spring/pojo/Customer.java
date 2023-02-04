package lk.ijse.Spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

   /* public Customer(){
        System.out.println("Customer Constructor()..!");
    }*/

    public Customer(@Value("ijse") String name){
        System.out.println("Customer Constructor(int i)..!"+name);
    }
}
