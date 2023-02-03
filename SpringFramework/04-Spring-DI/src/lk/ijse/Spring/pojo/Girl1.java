package lk.ijse.Spring.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements GoodGirl{

    public Girl1(){
        System.out.println("Girl Constructor..!");
    }


    @Override
    public void Chat(){
        System.out.println("Girl1 is Chat");
    }
}
