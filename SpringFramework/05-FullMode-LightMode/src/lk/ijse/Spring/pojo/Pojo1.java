package lk.ijse.Spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Pojo1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public Pojo1(){
        System.out.println("Pojo1 Constructor..!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Pojo1 Bean Name Aware! : "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Pojo1 Bean Factor Aware : "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Pojo1 applicationContext Aware : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pojo1  : InitializingBean bean");
        System.out.println("==========================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pojo1 : DisposableBean");
    }

    @Bean
    //Light Mode
    public Pojo2 pojo2(){
        //Inter-bean Dependency Invocation
        Pojo3 pojo31 = pojo3();
        Pojo3 pojo32 = pojo3();
        System.out.println(pojo31);
        System.out.println(pojo32);
        return new Pojo2();
    }

    @Bean
    public Pojo3 pojo3(){
        return new Pojo3();
    }
}
