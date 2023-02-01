package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Pojo1 implements BeanNameAware, BeanFactoryAware {
    public Pojo1(){
        System.out.println("Pojo1 Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware! : "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factor Aware : "+beanFactory);
    }
}
