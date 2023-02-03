package lk.ijse.Spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("girl2")
public class Boy {

    @Autowired
    GoodGirl girl2;



    public Boy(){
        System.out.println("Boy Constructor..!");
    }

    public void chatWithGirl(){
       // Girl girl = new Girl();
        girl2.Chat();
    }
}
