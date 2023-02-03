package lk.ijse.Spring.pojo;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Pojo3 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public Pojo3(){
        System.out.println("Pojo3 Constructor..!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Pojo3 Bean Name Aware! : "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Pojo3 Bean Factor Aware : "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Pojo3 applicationContext Aware : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pojo3  : InitializingBean bean");
        System.out.println("==========================");


    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Pojo3 : DisposableBean");
    }
}
