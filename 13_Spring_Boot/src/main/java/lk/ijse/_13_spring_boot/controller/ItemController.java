package lk.ijse._13_spring_boot.controller;

import lk.ijse._13_spring_boot.dto.ItemDTO;
import lk.ijse._13_spring_boot.service.impl.ItemServiceImpl;
import lk.ijse._13_spring_boot.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;
    @PostMapping("save")
    public ResponseUtil save(@RequestBody ItemDTO itemDTO){
        boolean res=itemService.save(itemDTO);
        if (res){
            return new ResponseUtil(201,"Item is Saved",null);
        }return new ResponseUtil(409,"already exist",null);


    }
    @PutMapping("update")
    public ResponseUtil update(@RequestBody ItemDTO itemDTO){

        boolean res=itemService.update(itemDTO);
        if (res){
            return new ResponseUtil(201,"Item is Updated",null);
        }return new ResponseUtil(409,"already exist",null);
    }
    @GetMapping("getAll")
    public ResponseUtil getAll(){
        return new ResponseUtil(200,"Success",itemService.getAll());
    }
    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil delete(@PathVariable(value = "id") int id){
        itemService.delete(id);
        return new ResponseUtil(200,"Item Deleted",null);
    }
}
