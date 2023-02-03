package lk.ijse.Spring.di;

import org.springframework.stereotype.Component;

@Component
public class B implements ABC{

    public B(){
        System.out.println("B Constructor..!");
    }

    @Override
    public void Chat() {
        System.out.println("B Chatting..!");
    }
}
