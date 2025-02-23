package lk.ijse._13_spring_boot.service;

import lk.ijse._13_spring_boot.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemService {
    public boolean save(ItemDTO itemDTO);
    public boolean update(ItemDTO itemDTO);
    public int delete(int id);
    public ArrayList<ItemDTO> getAll();
}
