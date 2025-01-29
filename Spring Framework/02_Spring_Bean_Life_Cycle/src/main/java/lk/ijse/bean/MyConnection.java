package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware,BeanFactoryAware, ApplicationContextAware, InitializingBean,DisposableBean {//implements DisposableBean // implements BeanNameAware//implements BeanFactoryAware
    public MyConnection(){
        System.out.println("MyConnection object is created");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection Bean  name set");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection Bean Factory");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection ApplicationContextAware");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection InitializingBean ");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");

    }

//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("MyConnection Bean Factory");
//    }

//    @Override
//    public void setBeanName(String name) {
//        System.out.println("MyConnection Bean  name set");
//    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("MyConnection object is destoryed");
//    }
}
