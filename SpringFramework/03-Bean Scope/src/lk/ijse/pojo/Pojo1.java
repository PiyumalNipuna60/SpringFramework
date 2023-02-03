package lk.ijse.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Pojo1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Pojo1(){
        System.out.println("Pojo1 Constructor..!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4 Bean setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3 Bean setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("7 DisposableBean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6 InitializingBean");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5 ApplicationContextAware");

    }
}
