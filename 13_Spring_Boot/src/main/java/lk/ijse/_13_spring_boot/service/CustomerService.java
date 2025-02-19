package lk.ijse._13_spring_boot.service;

import lk.ijse._13_spring_boot.dto.CustomerDTO;
import lk.ijse._13_spring_boot.entity.Customer;
import lk.ijse._13_spring_boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepo customerRepo;
    public boolean save(CustomerDTO customerDTO){
//        System.out.println("Service layered "+customerDTO.getAddress());
//        return true;
        Customer customer=new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()
        );
        customerRepo.save(customer);
        return true;
    }
    public ArrayList<CustomerDTO> getAll() {
        List<Customer> customers = customerRepo.findAll();
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();

        for (Customer customer : customers) {
            customerDTOS.add(new CustomerDTO(
                    customer.getId(),
                    customer.getName(),
                    customer.getAddress()
            ));
        }

        return customerDTOS;
    }
    public int delete(int id){
        customerRepo.deleteById(id);
        return id;
    }
    public boolean update(CustomerDTO customerDTO){
        if(customerRepo.existsById(customerDTO.getId())){
            Customer customer=new Customer(
                    customerDTO.getId(),
                    customerDTO.getName(),
                    customerDTO.getAddress()
            );
            customerRepo.save(customer);
            return true;
        }
        return false;
    }
}
