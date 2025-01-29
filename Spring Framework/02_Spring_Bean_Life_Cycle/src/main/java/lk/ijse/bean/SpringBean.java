package lk.ijse.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component//api hadana ewata thami component annotation eka danne
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean object is create");
    }
}
