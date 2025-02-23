package lk.ijse._13_spring_boot.service.impl;

import lk.ijse._13_spring_boot.dto.CustomerDTO;
import lk.ijse._13_spring_boot.entity.Customer;
import lk.ijse._13_spring_boot.repo.CustomerRepo;
import lk.ijse._13_spring_boot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;
    public void save(CustomerDTO customerDTO){
//        System.out.println("Service layered "+customerDTO.getAddress());
//        return true;
//        Customer customer=new Customer(
//                customerDTO.getId(),
//                customerDTO.getName(),
//                customerDTO.getAddress()
//        );
         if (customerRepo.existsById(customerDTO.getId())){
            throw new RuntimeException("Customer already exist");
         }
        customerRepo.save(modelMapper.map(customerDTO,Customer.class));

    }
    public ArrayList<CustomerDTO> getAll() {
//        List<Customer> customers = customerRepo.findAll();
//        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
//
//        for (Customer customer : customers) {
//            customerDTOS.add(new CustomerDTO(
//                    customer.getId(),
//                    customer.getName(),
//                    customer.getAddress()
//            ));
//        }
//
//        return customerDTOS;
        return modelMapper.map(customerRepo.findAll(),
                new TypeToken<List<CustomerDTO>>(){}.getType());

    }
    public void delete(int id){
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }

       throw new RuntimeException("Customer Not Exist");
    }
    public void update(CustomerDTO customerDTO){
        if(customerRepo.existsById(customerDTO.getId())){
//            Customer customer=new Customer(
//                    customerDTO.getId(),
//                    customerDTO.getName(),
//                    customerDTO.getAddress()
//            );
            customerRepo.save(modelMapper.map(customerDTO,Customer.class));

        }
       throw new RuntimeException("Customer not exist");
    }
}
