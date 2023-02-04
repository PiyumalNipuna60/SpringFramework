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

    @Value("${db.user.name}")
    public String dbUserName;

    @Value("${db.user.password}")
    public String dbUserPassword;

    public DBConnection(){
        System.out.println("DBConnection constructor..!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DBConnection Ocn Name : "+myOsName);
        System.out.println("DBConnection Ocn myUserName : "+myUserName);
        System.out.println("==============");
        System.out.println("DBConnection UserName : "+dbUserName);
        System.out.println("DBConnection Password : "+dbUserPassword);
    }
}
