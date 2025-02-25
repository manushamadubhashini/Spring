package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

//    @Autowired(required = false)
//    public SpringBean(@Value("manusha") String name,@Value("3") int id, @Value("true") boolean b){
//        System.out.println("Spring Bean");
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(b);//when have a constructor load maximan argument constructor is called
//    }
//    @Autowired(required = false)//this mean is what dependency inject
//    public SpringBean(@Value("manusha") String name,@Value("9") int id){
//        System.out.println("Spring Bean");
//        System.out.println(name);
//        System.out.println(id);
//0
//    }
    @Value("manusha")
    private String name;

    public SpringBean(){
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
