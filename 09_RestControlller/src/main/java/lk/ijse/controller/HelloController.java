package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello world!";
    }

    @PostMapping
    public String post(){return "post mapping";}

    @PutMapping
    public String put(){return "put mapping";}

    @DeleteMapping
    public String delete(){return "delete mapping";}

    @PatchMapping
    public String patch(){return "patch mapping";}
}
