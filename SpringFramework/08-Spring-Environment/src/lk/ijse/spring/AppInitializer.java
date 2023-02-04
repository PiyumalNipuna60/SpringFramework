package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();
        ant.registerShutdownHook();


        //OS Environment variables
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println(key+" : "+value);
        }

        System.out.println("==========================");


        //Java Environment variables
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            Object values = properties.get(key);
            System.out.println(key+" : "+values);
        }
    }
}
