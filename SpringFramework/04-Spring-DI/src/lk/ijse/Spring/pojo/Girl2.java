package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Girl2 implements GoodGirl{

    public Girl2(){
        System.out.println("Girl Constructor..!");
    }


    @Override
    public void Chat(){
        System.out.println("Girl2 is Chat");
    }
}
