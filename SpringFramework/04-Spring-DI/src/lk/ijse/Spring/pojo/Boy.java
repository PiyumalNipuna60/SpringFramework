package lk.ijse.Spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
    Girl girl;

    public Boy(){
        System.out.println("Boy Constructor..!");
    }

    public void chatWithGirl(){
       // Girl girl = new Girl();
        girl.Chat();
    }
}
