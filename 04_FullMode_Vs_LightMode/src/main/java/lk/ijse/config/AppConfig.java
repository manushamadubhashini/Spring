package lk.ijse.config;

import lk.ijse.bean.SpringBean2;
import lk.ijse.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
//    @Bean//bean ekak sthule thwa bean ekak call karala thiyenm inter bean depedency kiyala kiynwa
//    public SpringBean1 getSpringBean1(){
//        SpringBean2 springBean2One=new SpringBean2();
//        SpringBean2 springBean2Two=new SpringBean2();
//        return new SpringBean1();
//    }
//    @Bean
//    public SpringBean2 getSpringBean2(){
//    return new SpringBean2();
//    }
//@Bean
//public SpringBean2 springBeanTwo() {
//    SpringBean3 springBean3One = springBeanThree();
//    SpringBean3 springBean3Two = springBeanThree();
//    return new SpringBean2();
//}
//    @Bean
//    public SpringBean3 springBeanThree() {
//        return new SpringBean3();
//    }
}
