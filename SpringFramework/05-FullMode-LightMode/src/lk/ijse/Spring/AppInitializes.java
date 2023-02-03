package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializes {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext abc = new AnnotationConfigApplicationContext();
        abc.register(AppConfig.class);
        abc.refresh();
        abc.registerShutdownHook();
    }
}
