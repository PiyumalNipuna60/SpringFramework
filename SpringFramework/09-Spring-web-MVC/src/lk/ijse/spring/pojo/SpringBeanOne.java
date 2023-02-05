package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanOne(){
        System.out.println("Spring Bean Constructor..!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean BeanFactory..!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean setBeanName..!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean DisposableBean..!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean InitializingBean..!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean ApplicationContextAware..!");
    }
}
