package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DiInterface {
//    @Autowired
    DI test1;
//     @Autowired
//    public  Test2(DI test1){
////        System.out.println("Test 2 constructor");
//        this.test1=test1;
//    }
//    @Autowired
//    public void setter(DI test1){
//         this.test1=test1;
//    }

    public void display(){
        test1.sayHello();
    }
    @Autowired
    @Override
    public void inject(DI test1) {
        this.test1=test1;
    }
}
