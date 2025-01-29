package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Qualifier("girl1")
    @Autowired
//    Girl girl;//
    Agreement girl;

    public void chatWithGirl(){
        girl.chat();
    }
    public Boy(){
        System.out.println("Boy Constructor");
    }

}
