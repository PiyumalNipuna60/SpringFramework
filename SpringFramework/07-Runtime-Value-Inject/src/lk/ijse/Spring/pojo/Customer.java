package lk.ijse.Spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

   /* public Customer(){
        System.out.println("Customer Constructor()..!");
    }*/

  /*  public Customer(@Value("ijse") String name){    //String Data
        System.out.println("Customer Constructor(int i)..!"+name);
    }*/

    //can assign with @Value annotation >
    //Primitive data Type
    //String Data
    //Arrays

    public Customer(@Value("10") int age){    //Primitive data Type
        System.out.println("Customer Constructor(int i)..! "+age);
    }
}
