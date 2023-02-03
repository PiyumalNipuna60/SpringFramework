package lk.ijse.Spring.di;

import org.springframework.stereotype.Component;

@Component
public class A implements ABC {

    public A(){
        System.out.println("A Constructor..!");
    }

    @Override
    public void Chat() {
        System.out.println("A Chatting..!");
    }
}
