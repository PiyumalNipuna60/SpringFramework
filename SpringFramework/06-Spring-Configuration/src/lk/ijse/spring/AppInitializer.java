package lk.ijse.spring;

import lk.ijse.spring.config.AppConfige;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfige.class);
        ant.refresh();
        ant.registerShutdownHook();
    }
}
