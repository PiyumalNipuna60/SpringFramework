package lk.ijse.spring.pojo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Pojo1 implements BeanNameAware {
    public Pojo1(){
        System.out.println("Pojo1 Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Avear! : "+name);
    }
}
