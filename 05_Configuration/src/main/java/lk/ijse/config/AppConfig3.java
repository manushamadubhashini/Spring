package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({AppConfig1.class, AppConfig2.class})
//root
@ImportResource("classpath:hibernate.xml")
//if not
//@ImportResource("file: absolute-path-of-hibernate.xml")
public class AppConfig3 {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
