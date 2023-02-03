package lk.ijse;

import lk.ijse.config.AppConfig;
import lk.ijse.pojo.Pojo1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext();
        ant.register(AppConfig.class);
        ant.refresh();

        Pojo1 bean1 = ant.getBean(Pojo1.class);
        Pojo1 bean2 = ant.getBean(Pojo1.class);
        System.out.println("Bean 1 : "+bean1);
        System.out.println("Bean 2 : "+bean2);
        //case 1
        //* SCOPE_PROTOTYPE nisa bean life cycle eka object hadana ganata run veava
        //* SCOPE_PROTOTYPE nisa distroy method eka run venne naha


        ant.registerShutdownHook();
    }
}
