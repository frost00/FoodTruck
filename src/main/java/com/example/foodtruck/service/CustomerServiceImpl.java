package com.example.foodtruck.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodtruck.pojo.Customer;
import com.example.foodtruck.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>)customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(String id, Customer customer){
        
    }
    
    @Override
    public void deleteCustomer(String id){
        customerRepository.deleteById(id);
    }

 

   

   
}
