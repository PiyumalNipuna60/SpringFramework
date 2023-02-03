package lk.ijse.Spring;

import lk.ijse.Spring.Config.AppConfig;
import lk.ijse.Spring.pojo.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();


        Boy boy = ant.getBean(Boy.class);
        boy.chatWithGirl();

        ant.registerShutdownHook();
    }
}
