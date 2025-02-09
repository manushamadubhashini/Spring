package lk.ijse.controller;


import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping
    public String test1(@RequestBody CustomerDTO customerDTO){
        return customerDTO.toString();
    }
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> test2(){
        ArrayList<CustomerDTO> customerDTOList=new ArrayList<>();
//        return new CustomerDTO("mala","silva",20);
        customerDTOList.add(new CustomerDTO("kamal","silva",20));
        customerDTOList.add(new CustomerDTO("nimal","silva",30));
        return customerDTOList;

    }
//    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
//    public CustomerDTO test2(){
//        return new CustomerDTO("sandumi","dilthara" ,23);
//    }
}
