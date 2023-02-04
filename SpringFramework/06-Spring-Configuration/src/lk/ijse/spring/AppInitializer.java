package lk.ijse.spring;

import lk.ijse.spring.config.AppConfige;
import lk.ijse.spring.config.ConfigeOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();

        //if we have more them to the one config class
        //we can register them to the context as follows
        ant.register(AppConfige.class);
        ant.register(ConfigeOne.class);
        ant.refresh();
        ant.registerShutdownHook();
    }
}
