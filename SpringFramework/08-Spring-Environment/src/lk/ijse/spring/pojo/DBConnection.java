package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {

    @Value("${os.name}")   //Property Placeholder
    public String myOsName;

    @Value("${user.name}")
    public String myUserName;

    public DBConnection(){
        System.out.println("DBConnection constructor..!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DBConnection Ocn Name : "+myOsName);
        System.out.println("DBConnection Ocn myUserName : "+myUserName);
    }
}
