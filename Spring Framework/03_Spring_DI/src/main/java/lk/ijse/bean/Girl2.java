package lk.ijse.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Girl2 implements Agreement{

    public Girl2(){
        System.out.println("Girl Constructor");
    }

    @Override
    public void chat() {
        System.out.println("girl2 chatting....");
    }
}
