package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Pojo1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext Aware : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pojo1  : InitializingBean bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pojo1 : DisposableBean");
    }
}
