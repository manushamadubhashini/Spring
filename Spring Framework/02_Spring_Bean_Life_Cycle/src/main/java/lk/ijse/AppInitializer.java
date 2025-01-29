package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        SpringBean springBean=context.getBean("springBean", SpringBean.class);
//        System.out.println(springBean);
//        MyConnection myConnection=context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//        MyConnection myConnection1=context.getBean(MyConnection.class);
//        System.out.println(myConnection1);
        MyConnection myConnection1=context.getBean(MyConnection.class);
        System.out.println("-------------------");
        MyConnection myConnection2=context.getBean(MyConnection.class);
        context.registerShutdownHook();//aplication context eka thama thiyano comment karama application context eka close wenna mohothakta kalin destory method eka call weno
    }
}