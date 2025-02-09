package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariable {
    @GetMapping(path = "{id:[I][0-9]{3}}")
    public String variable1(@org.springframework.web.bind.annotation.PathVariable("id") String id){
        return id;
    }
    @GetMapping(path = "{CustomerId}")
    public String variable2(@org.springframework.web.bind.annotation.PathVariable("CustomerId") String id){
        return id;
    }
    @GetMapping(path = "{CustomerId}/{CustomerName}")
    public String variable3(
            @org.springframework.web.bind.annotation.PathVariable("CustomerId") String id,
            @org.springframework.web.bind.annotation.PathVariable("CustomerName") String name){
        return id+" "+name;


    }



}
