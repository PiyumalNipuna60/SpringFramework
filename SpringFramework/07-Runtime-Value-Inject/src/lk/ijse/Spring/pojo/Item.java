package lk.ijse.Spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Item implements InitializingBean {

    @Value("Nipuna")
    private String name;


    public Item(){
        System.out.println("Item Constructor..!");
        System.out.println(name);  //null values - life cycle eke 2nd stage(populate Property) ekata gihin naha thama
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Item InitializingBean..!");
        System.out.println(name);
    }
}
