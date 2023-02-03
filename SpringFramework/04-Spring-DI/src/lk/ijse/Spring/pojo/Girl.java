package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{

    public Girl(){
        System.out.println("Girl Constructor..!");
    }


    @Override
    public void Chat(){
        System.out.println("Girl is Chat");
    }
}
