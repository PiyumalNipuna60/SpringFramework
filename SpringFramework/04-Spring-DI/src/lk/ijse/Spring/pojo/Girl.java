package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Girl {

    public Girl(){
        System.out.println("Girl Constructor..!");
    }

    public void Chat(){
        System.out.println("Girl is Chat");
    }
}
