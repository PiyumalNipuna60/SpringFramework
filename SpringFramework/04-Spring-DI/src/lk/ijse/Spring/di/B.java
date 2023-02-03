package lk.ijse.Spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B{

/*    @Autowired
    ABC abc;//Property Inject*/

    ABC abc;

    @Autowired
    public B(ABC a){
        this.abc=a;//Constructor Inject
        System.out.println("B Constructor..!");
    }

    public void test(){
        abc.Chat();
    }


}
