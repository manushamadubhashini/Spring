package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
@Component
public class SpringBean1 implements BeanNameAware , ApplicationContextAware {
//    public SpringBean1(){
//        System.out.println("Spring Bean1 Constructor");
//    }
    @Bean
    public SpringBean2 springBean2(){
//        SpringBean3 springBean3One=new SpringBean3();
//        SpringBean3 springBean3Two=new SpringBean3();

        SpringBean3 springBean3One=springBean3();
        SpringBean3 springBean3Two=springBean3();

        System.out.println(springBean3One);
        System.out.println(springBean3Two);
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean1 setName");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean2 setContext");
    }
}
