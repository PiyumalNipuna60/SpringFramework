package lk.ijse.Spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B implements DI {

/*    @Autowired
    ABC abc;//Property Inject*/

    ABC abc;

    @Autowired
    public B(ABC a) {
        /*this.abc=a;//Constructor Inject*/
        System.out.println("B Constructor..!");
    }

  /*  @Autowired
    public void setInject(ABC a){
        this.abc=a;//Setter Method Injecter
    }*/

    public void test() {
        abc.Chat();
    }

    @Autowired
    @Override
    public void Inject(ABC a) {
        this.abc = a; //Interface Inject
    }
}
