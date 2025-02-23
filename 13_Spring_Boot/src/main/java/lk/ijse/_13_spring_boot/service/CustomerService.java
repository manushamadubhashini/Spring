package lk.ijse._13_spring_boot.service;

import lk.ijse._13_spring_boot.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    public void save(CustomerDTO customerDTO);
    public ArrayList<CustomerDTO> getAll();
    public void update(CustomerDTO customerDTO);
    public void delete(int id);
}
