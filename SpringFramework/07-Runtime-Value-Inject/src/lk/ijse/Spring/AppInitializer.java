package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();
        ant.registerShutdownHook();
    }
}
