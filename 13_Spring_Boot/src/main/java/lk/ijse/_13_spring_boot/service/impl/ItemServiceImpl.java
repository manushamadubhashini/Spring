package lk.ijse._13_spring_boot.service.impl;

import lk.ijse._13_spring_boot.dto.ItemDTO;
import lk.ijse._13_spring_boot.entity.Item;
import lk.ijse._13_spring_boot.repo.ItemRepo;
import lk.ijse._13_spring_boot.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;
    public boolean save(ItemDTO itemDTO){
//        Item item=new Item(
//                itemDTO.getId(),
//                itemDTO.getName(),
//                itemDTO.getDescription(),
//                itemDTO.getQty(),
//                itemDTO.getPrice()
//        );
        itemRepo.save(modelMapper.map(itemDTO, Item.class));
        return true;
    }
    public boolean update(ItemDTO itemDTO){
        if(itemRepo.existsById(itemDTO.getId())){
//            Item item=new Item(
//                    itemDTO.getId(),
//                    itemDTO.getName(),
//                    itemDTO.getDescription(),
//                    itemDTO.getQty(),
//                    itemDTO.getPrice()
//            );
//            itemRepo.save(item);
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
            return true;
        }
        return false;
    }
    public ArrayList<ItemDTO> getAll(){
//        List<Item> items=itemRepo.findAll();
//        ArrayList<ItemDTO> itemDTOArrayList=new ArrayList<>();
//        for (Item item:items){
//            itemDTOArrayList.add(new ItemDTO(
//                    item.getId(),
//                    item.getName(),
//                    item.getDescription(),
//                    item.getQty(),
//                    item.getPrice()
//            ));
//
//        }
        return modelMapper.map(itemRepo.findAll(),
                new TypeToken<List<ItemDTO>>(){}.getType());
//        return itemDTOArrayList;
    }
    public int delete(int id){
        itemRepo.deleteById(id);
        return id;
    }

}
