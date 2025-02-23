package lk.ijse._13_spring_boot.controller;

import lk.ijse._13_spring_boot.dto.CustomerDTO;
import lk.ijse._13_spring_boot.service.impl.CustomerServiceImpl;
import lk.ijse._13_spring_boot.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;
    @PostMapping(path = "save")
//    public Boolean getCustomer(@RequestBody CustomerDTO customerDTO){
//        boolean res=customerService.save(customerDTO);
//        return res;
//    }
    public ResponseUtil getCustomer(@RequestBody CustomerDTO customerDTO){
//        boolean res=customerService.save(customerDTO);
//       if (res){
//           return new ResponseUtil(201,"Customer is Saved",null);
//       }return new ResponseUtil(409,"already exist",null);
        customerService.save(customerDTO);
        return new ResponseUtil(201,"Customer is Saved",null);

    }

    @GetMapping(path = "getAll")
//    public ArrayList<CustomerDTO> getAll(){
//        return customerService.getAll();
//
//    }
    public ResponseUtil getAll() {
        return new ResponseUtil(200,"Success",customerService.getAll());

    }

    @DeleteMapping(path = "delete/{id}")
//    public int deleteCustomer(@PathVariable(value = "id") int id){
//        return customerService.delete(id);
//    }
    public ResponseUtil deleteCustomer(@PathVariable(value = "id") int id){
         customerService.delete(id);
         return new ResponseUtil(200,"Customer Deleted",null);
    }
    @PutMapping(path = "update")
//    public boolean update(@RequestBody CustomerDTO customerDTO){
//        return customerService.update(customerDTO);
//
//    }
    public ResponseUtil update(@RequestBody CustomerDTO customerDTO){
//        boolean res=customerService.update(customerDTO);
        customerService.update(customerDTO);
//      if (res){
//         return new ResponseUtil(201,"Customer is Updated",null);
//       }return new ResponseUtil(409,"already exist",null);

            return new ResponseUtil(201,"Customer is Updated",null);
    }
//
//
//    }
}
