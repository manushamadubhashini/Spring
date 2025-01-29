package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import lk.ijse.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig2.class})
//@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig1 {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
