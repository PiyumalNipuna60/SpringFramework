package lk.ijse.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pojo1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Pojo1(){
        System.out.println("Pojo1 Constructor..!");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean1 BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean1 BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean1 DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean1 InitializingBean");
        System.out.println("====================");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("bean setApplicationContext");
    }
}
