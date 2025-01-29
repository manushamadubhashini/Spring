package lk.ijse;

import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitialize {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.register(AppConfig2.class);
        context.refresh();
        Map<String,String> getenv=System.getenv();
        for (String key:getenv.keySet()){
            System.out.println(key+"="+getenv.get(key));
        }


        context.registerShutdownHook();
    }
}
