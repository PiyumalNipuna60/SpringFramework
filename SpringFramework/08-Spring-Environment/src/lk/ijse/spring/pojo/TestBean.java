package lk.ijse.spring.pojo;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements InitializingBean {

    @Autowired
    Environment environment;

    public TestBean(){
        System.out.println("TestBean constructor..!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        String property = environment.getProperty("db.user.name");  //if the key is note available is return null
        System.out.println("TestBean myUserName : "+property);
        System.out.println("==============");

        String requiredProperty = environment.getRequiredProperty("db.user.name");   //if the key is note available it throw an Exception
        System.out.println("TestBean myUserName requiredProperty : "+requiredProperty);
        System.out.println("==============");
    }
}
