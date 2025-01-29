package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration//spring bean application context ekata wetene kohomda
@ComponentScan(basePackages = "lk.ijse.bean")
//@ComponentScan(basePackageClasses = SpringBean.class)
public class AppConfig {
    @Bean
    @Scope("prototype")
    MyConnection myConnection(){
        return new MyConnection();
    }
}
