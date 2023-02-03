package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public Customer(){
        System.out.println("Customer Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Customer Bean name : "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Customer Bean Factory : "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Customer applicationContext : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Customer Initializer");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Customer DisposableBean");
    }
}
