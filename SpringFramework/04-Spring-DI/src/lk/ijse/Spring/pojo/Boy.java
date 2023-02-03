package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Boy {

    public Boy(){
        System.out.println("Boy Constructor..!");
    }

    public void chatWithGirl(){
        Girl girl = new Girl();
        girl.Chat();
    }
}
