package lk.ijse;

import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.getBean(AppConfig.class);
        ant.refresh();
        ant.registerShutdownHook();
    }
}
