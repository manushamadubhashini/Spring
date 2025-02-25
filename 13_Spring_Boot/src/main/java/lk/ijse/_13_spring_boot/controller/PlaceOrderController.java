package lk.ijse._13_spring_boot.controller;

import lk.ijse._13_spring_boot.dto.PlaceOrderDTO;
import lk.ijse._13_spring_boot.service.PlaceOrderService;
import lk.ijse._13_spring_boot.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/order")
@CrossOrigin
public class PlaceOrderController {
    @Autowired
    private PlaceOrderService placeOrderService;
    @PostMapping("save")
    public ResponseUtil save(@RequestBody PlaceOrderDTO placeOrderDTO){
        placeOrderService.save(placeOrderDTO);
        return new ResponseUtil(201,"Order Saved!",null);
    }
}
