package lk.ijse._13_spring_boot.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse._13_spring_boot.dto.ItemDTO;
import lk.ijse._13_spring_boot.dto.PlaceOrderDTO;
import lk.ijse._13_spring_boot.embedded.OrderDetailPK;
import lk.ijse._13_spring_boot.entity.Item;
import lk.ijse._13_spring_boot.entity.Order;
import lk.ijse._13_spring_boot.entity.OrderDetails;
import lk.ijse._13_spring_boot.repo.CustomerRepo;
import lk.ijse._13_spring_boot.repo.ItemRepo;
import lk.ijse._13_spring_boot.repo.OrderDetailRepo;
import lk.ijse._13_spring_boot.repo.OrderRepo;
import lk.ijse._13_spring_boot.service.PlaceOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Optional;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {
    @Autowired
    private OrderDetailRepo orderDetailRepo;
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ItemRepo itemRepo;
    @Override
    @Transactional
    public void save(PlaceOrderDTO placeOrderDTO) {
        if (!customerRepo.existsById(placeOrderDTO.getCustomerId())){
            throw new RuntimeException("Customer id not found");
        }
        Order order=orderRepo.save(modelMapper.map(placeOrderDTO, Order.class));
        for(ItemDTO itemDTO:placeOrderDTO.getItemDTOList()){
            Optional<Item> existingItem=itemRepo.findById(itemDTO.getId());
            Item item=existingItem.get();
            orderDetailRepo.save(new OrderDetails(new OrderDetailPK(placeOrderDTO.getOid(),itemDTO.getId()),itemDTO.getQty(),order,item));

            item.setQty(item.getQty() - itemDTO.getQty());
            itemRepo.save(item);
        }


    }
}
