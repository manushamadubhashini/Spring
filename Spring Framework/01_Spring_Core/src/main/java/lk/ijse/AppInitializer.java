package lk.ijse;

import lk.ijse.bean.*;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        SpringBean bean= (SpringBean) context.getBean("springBean");
//        System.out.println(bean);
//        Object bean1=context.getBean("springBean");
//        System.out.println(bean1);
//        bean.testBean();
////        Runtime.getRuntime().addShutdownHook(new Thread(){
////            @Override
////            public void run() {
////                System.out.println("shutting down.....");
////                context.close();//jvm eka shoutdown wen welawedi thamin cntext close wenne
////            }
////        });
//        context.registerShutdownHook();
////        TestBean1 testBean1=context.getBean(TestBean1.class);
////        System.out.println(testBean1);
//        TestBean1 testBean1= (TestBean1) context.getBean("testBean1");
//        System.out.println(testBean1);
//        TestBean2 testBean2=context.getBean("bean2", TestBean2.class);
//        System.out.println(testBean2);
//        MyConnection myConnection=context.getBean("myConnection", MyConnection.class);
//        System.out.println(myConnection);
//        MyConnection myConnection1=context.getBean(MyConnection.class);
//        System.out.println(myConnection1);
//
//
        TestBean1 ref1=context.getBean("testBean1", TestBean1.class);
        TestBean1 ref2=context.getBean("testBean1", TestBean1.class);
        System.out.println(ref1);
        System.out.println(ref2);
        TestBean2 ref3=context.getBean("testBean2", TestBean2.class);
        TestBean2 ref4=context.getBean("testBean2", TestBean2.class);
        System.out.println(ref3);
        System.out.println(ref4);
        MyConnection ref5=context.getBean("myConnection", MyConnection.class);
        MyConnection ref6=context.getBean("myConnection", MyConnection.class);
        System.out.println(ref5);
        System.out.println(ref6);


    }
}
