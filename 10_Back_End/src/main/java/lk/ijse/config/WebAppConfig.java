package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.controller"})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedOrigins("*").allowedOrigins("GET","POST,","PUT","DELETE","OPTION").allowCredentials(true).allowedHeaders("*");
        //registry.addMapping("api/v1/customer/**")
        //allowedOrigins("*") any origin
        //allowedOrigins(""http://localhost:63342") specific origin
        //allowedOrigins("GET","POST,","PUT","DELETE","OPTION"). any method allowed
       // allowedHeaders("*") request has more header therefore allowed all header
        //postman is direct send request therefore not get cross error

    }
}
